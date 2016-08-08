package com.br.camarllon.marvelorchestrator.repositories;

import java.net.URI;
import java.util.List;

import com.br.camarllon.marvelorchestrator.models.Character;

public interface MarvelCharacterRepository {
    List<Character> findAll();
    Character findOneById(int pId);
    Character findOneByURI(URI resourceURI);
    List<Character> findAll(URI resourceURI);
    boolean remove(int pId);
}
