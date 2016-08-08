package com.br.camarllon.marvelorchestrator.services;

import java.util.List;

import com.br.camarllon.marvelorchestrator.models.Character;

public interface MarvelCharacterService {
    List<Character> findAll();
    Character findOneById(int pId);
    List<Character> findAllByComic(int pId);
    boolean remove(int pId);
}
