package com.br.camarllon.marvelorchestrator.repositories;

import java.net.URI;
import java.util.List;

import com.br.camarllon.marvelorchestrator.models.Comic;

public interface MarvelComicRepository {
    List<Comic> findAll();
    Comic findOneById(int pId);
    Comic findOneByURI(URI resourceURI);
    List<Comic> findAll(URI resourceURI);
    boolean remove(int pId);
}
