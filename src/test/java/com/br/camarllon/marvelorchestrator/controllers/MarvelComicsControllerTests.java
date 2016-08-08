package com.br.camarllon.marvelorchestrator.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.camarllon.marvelorchestrator.models.Character;
import com.br.camarllon.marvelorchestrator.models.Comic;
import com.br.camarllon.marvelorchestrator.services.MarvelComicService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarvelComicsControllerTests {

    public static final int MARVEL_COMIC_ID_AVENGERS_IRON_MAN_II = 29795;

    @Autowired
    private MarvelComicService comicService;

    @Test
    public void testComicFindAll() {
        List<Comic> listComics = comicService.findAll();
        //for(Comic comic : listComics){System.out.println(comic.id + " - " + comic.title);}
        assertFalse(listComics.isEmpty());
    }

    @Test
    public void testComicFindOneById() {
        Comic comic = comicService.findOneById(MARVEL_COMIC_ID_AVENGERS_IRON_MAN_II);
        assertEquals(comic.id, MARVEL_COMIC_ID_AVENGERS_IRON_MAN_II);
    }

    @Test
    public void testComicRemoveById() {
        Comic comic = comicService.findOneById(MARVEL_COMIC_ID_AVENGERS_IRON_MAN_II);
        boolean isComicRemoved = comicService.remove(MARVEL_COMIC_ID_AVENGERS_IRON_MAN_II);
        assertTrue(isComicRemoved);
    }
}
