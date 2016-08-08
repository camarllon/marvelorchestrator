package com.br.camarllon.marvelorchestrator.services;

import java.util.List;

import com.br.camarllon.marvelorchestrator.models.Comic;

public interface MarvelComicService {
    List<Comic> findAll();
    Comic findOneById(int pId);
    boolean remove(int pId);
}
