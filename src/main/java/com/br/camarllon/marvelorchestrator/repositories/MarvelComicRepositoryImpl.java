package com.br.camarllon.marvelorchestrator.repositories;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.br.camarllon.marvelorchestrator.models.Comic;
import com.br.camarllon.marvelorchestrator.models.ComicDataWrapper;
import com.br.camarllon.marvelorchestrator.services.MarvelAPIService;
import com.google.common.collect.Iterables;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class MarvelComicRepositoryImpl implements MarvelComicRepository {

    private static final Logger logger = LoggerFactory.getLogger(MarvelComicRepositoryImpl.class);

    @Autowired
    private MarvelAPIService marvelsAPIService;

    @Override
    @Cacheable("cacheComics")
    public Comic findOneById(int pId) {
        URI targetURI = marvelsAPIService.buildFromMarvelPublicURI(String.format("/comics/%s", pId));
        return findOneByURI(targetURI);
    }

    @Override
    @Cacheable("cacheComics")
    public List<Comic> findAll() {
        URI targetURI = marvelsAPIService.buildFromMarvelPublicURI("/comics");
        return findAll(targetURI);
    }

    @Override
    @Cacheable("cacheComics")
    public Comic findOneByURI(URI resourceURI) {
        List<Comic> listComics = findAll(resourceURI);
        return Iterables.getFirst(listComics, null);
    }

    @Override
    @Cacheable("cacheComics")
    public List<Comic> findAll(URI resourceURI) {
        RestTemplate restTemplate = new RestTemplate();
        URI authTargetURI = marvelsAPIService.buildAuthenticatedURI(resourceURI);
        ComicDataWrapper ComicsDataWrapper = restTemplate.getForObject(authTargetURI, ComicDataWrapper.class);
        List<Comic> listComics = ComicsDataWrapper.data.results.isEmpty() ? Lists.newArrayList()
                        : ComicsDataWrapper.data.results;

        return listComics;
    }

    @Override
    @CacheEvict("cacheComics")
    public boolean remove(int pId) {
        return true;
    }
}
