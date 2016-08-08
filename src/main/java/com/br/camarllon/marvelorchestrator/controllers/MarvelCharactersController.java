package com.br.camarllon.marvelorchestrator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.camarllon.marvelorchestrator.models.Character;
import com.br.camarllon.marvelorchestrator.services.MarvelCharacterServiceImpl;

@RestController
@RequestMapping("/characters")
public class MarvelCharactersController {

    @Autowired
    private MarvelCharacterServiceImpl charactersService;

    @RequestMapping("")
    public List<Character> findAll() {
        return charactersService.findAll();
    }

    @RequestMapping("/{pId}")
    public Character findOneById(@PathVariable int pId) {
        return charactersService.findOneById(pId);
    }

    @RequestMapping("/byComic/{pId}")
    public List<Character> findAllByComic(@PathVariable int pId) {
        return charactersService.findAllByComic(pId);
    }

    @RequestMapping(value = "/remove/{pId}", method = RequestMethod.DELETE)
    public boolean removeById(@PathVariable int pId) {
        return charactersService.remove(pId);
    }
}
