package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test
    public void shouldFindAll() {
        String film1 = "Bladshot";
        String film2 = "Forward";
        String film3 = "HotelBelgrad";
       //  String film4 = "Gentlemen";
        // String film5 = "InvisibleMan";
        // String film6 = "Trolles";
       // String film7 = "NumberOne";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        String[] actual = manager.findAll();
        String[] expected = { film1, film2, film3 };
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {
        String film1 = "Bladshot";
        String film2 = "Forward";
        String film3 = "HotelBelgrad";
        //  String film4 = "Gentlemen";
        // String film5 = "InvisibleMan";
        // String film6 = "Trolles";
        // String film7 = "NumberOne";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        String[] actual = manager.findLast();
        String[] expected = { film3, film2, film1 };
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithoutLimit() {


        String film1 = "Bladshot";
        String film2 = "Forward";
        String film3 = "HotelBelgrad";
        String film4 = "Gentlemen";
        String film5 = "InvisibleMan";
        String film6 = "Trolles";
        String film7 = "NumberOne";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);


        String[] actual = manager.findLast();
        String[] expected = { film7, film6, film5, film4, film3, film2, film1 };
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithLimit() {

        String film1 = "Bladshot";
        String film2 = "Forward";
        String film3 = "HotelBelgrad";
        String film4 = "Gentlemen";
        String film5 = "InvisibleMan";
        String film6 = "Trolles";
        String film7 = "NumberOne";

        FilmManager manager = new FilmManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);


        String[] actual = manager.findLast();
        String[] expected = { film7, film6, film5 };
        Assertions.assertArrayEquals(expected, actual);

    }
}


