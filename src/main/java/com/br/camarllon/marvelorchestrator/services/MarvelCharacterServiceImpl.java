package com.br.camarllon.marvelorchestrator.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.camarllon.marvelorchestrator.models.Character;
import com.br.camarllon.marvelorchestrator.models.CharacterSummary;
import com.br.camarllon.marvelorchestrator.models.Comic;
import com.br.camarllon.marvelorchestrator.repositories.MarvelCharacterRepository;

@Service
public class MarvelCharacterServiceImpl implements MarvelCharacterService {

    private static final Logger logger = LoggerFactory.getLogger(MarvelCharacterServiceImpl.class);

    @Autowired
    private MarvelComicService comicService;

    @Autowired
    private MarvelCharacterRepository characterRepository;

    @Override
    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public List<Character> findAllByComic(int pId) {
        List<Character> listCharacters = new ArrayList<>();
        Comic comic = comicService.findOneById(pId);

        for (CharacterSummary characterSummary : comic.characters.items) {
            URI resourceURI;
            try {
                resourceURI = new URI(characterSummary.resourceURI);
                List<Character> characters = characterRepository.findAll(resourceURI);
                listCharacters.addAll(characters);
            } catch (URISyntaxException e) {
                logger.error("Can't recover character from URI", e);
            }
        }

        return listCharacters;
    }

    @Override
    public Character findOneById(int pId) {
        return characterRepository.findOneById(pId);
    }

    @Override
    public boolean remove(int pId) {
        return characterRepository.remove(pId);
    }
}
