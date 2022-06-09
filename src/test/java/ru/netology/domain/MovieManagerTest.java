package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    Movie first = new Movie("bladshot", "Бладшот", "action");
    Movie second = new Movie("vpered", "Вперед", "cartoon");
    Movie third = new Movie("otel-Belgrad", "Отель Белград", "comedy");
    Movie fourth = new Movie("dzhentlmeny", "Джентльмены", "action");
    Movie fifth = new Movie("сhelovek-nevidimka", "Человек-невидимка", "horror");
    Movie sixth = new Movie("trolli", "Тролли.Мировой тур", "cartoon");
    Movie seventh = new Movie("nomer-odin", "Номер один", "comedy");
    Movie eighth = new Movie("сhelovek-nevidimka2", "Человек-невидимка2", "horror");
    Movie ninth = new Movie("trolli2", "Тролли.Мировой тур2", "cartoon");
    Movie tenth = new Movie("nomer-odin2", "Номер один2", "comedy");

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);

        Movie[] actual = manager.findAll();
        Movie[] expected = {first, second, third, fourth, fifth, sixth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testDefault() {
        MovieManager manager = new MovieManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] actual = manager.findLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotDefault1() {
        MovieManager manager = new MovieManager(5);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] actual = manager.findLast();

        Movie[] expected = {tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotDefault2() {
        MovieManager manager = new MovieManager(2);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] actual = manager.findLast();

        Movie[] expected = {tenth, ninth};

        Assertions.assertArrayEquals(expected, actual);
    }
}
