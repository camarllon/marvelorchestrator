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

import com.br.camarllon.marvelorchestrator.models.Character;
import com.br.camarllon.marvelorchestrator.models.CharacterDataWrapper;
import com.br.camarllon.marvelorchestrator.services.MarvelAPIService;
import com.google.common.collect.Iterables;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class MarvelCharacterRepositoryImpl implements MarvelCharacterRepository {

    private static final Logger logger = LoggerFactory.getLogger(MarvelCharacterRepositoryImpl.class);

    @Autowired
    private MarvelAPIService marvelsAPIService;

    @Override
    @Cacheable("cacheCharacters")
    public Character findOneById(int pId) {
        URI targetURI = marvelsAPIService.buildFromMarvelPublicURI(String.format("/characters/%s", pId));
        return findOneByURI(targetURI);
    }

    @Override
    @Cacheable("cacheCharacters")
    public List<Character> findAll() {
        URI targetURI = marvelsAPIService.buildFromMarvelPublicURI("/characters");
        return findAll(targetURI);
    }

    @Override
    @Cacheable("cacheCharacters")
    public Character findOneByURI(URI resourceURI) {
        List<Character> listCharacters = findAll(resourceURI);
        return Iterables.getFirst(listCharacters, null);
    }

    @Override
    @Cacheable("cacheCharacters")
    public List<Character> findAll(URI resourceURI) {
        RestTemplate restTemplate = new RestTemplate();
        URI authTargetURI = marvelsAPIService.buildAuthenticatedURI(resourceURI);
        CharacterDataWrapper charactersDataWrapper = restTemplate.getForObject(authTargetURI,
                        CharacterDataWrapper.class);
        List<Character> listCharacters = charactersDataWrapper.data.results.isEmpty() ? Lists.newArrayList()
                        : charactersDataWrapper.data.results;

        return listCharacters;
    }

    @Override
    @CacheEvict("cacheCharacters")
    public boolean remove(int pId) {
        return true;
    }
}
