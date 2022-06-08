package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.Movie;
import ru.netology.repository.MovieRepository;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class MovieManagerTest {
    private MovieRepository repository = Mockito.mock(MovieRepository.class);
    private MovieManager manager = new MovieManager(repository);


    private Movie first = new Movie("bladshot", "Бладшот", "action");
    private Movie second = new Movie("vpered", "Вперед", "cartoon");
    private Movie third = new Movie("otel-Belgrad", "Отель Белград", "comedy");
    private Movie fourth = new Movie("dzhentlmeny", "Джентльмены", "action");
    private Movie fifth = new Movie("сhelovek-nevidimka", "Человек-невидимка", "horror");
    private Movie sixth = new Movie("trolli", "Тролли.Мировой тур", "cartoon");
    private Movie seventh = new Movie("nomer-odin", "Номер один", "comedy");
    private Movie eighth = new Movie("сhelovek-nevidimka2", "Человек-невидимка2", "horror");
    private Movie ninth = new Movie("trolli2", "Тролли.Мировой тур2", "cartoon");
    private Movie tenth = new Movie("nomer-odin2", "Номер один2", "comedy");


    @Test
    public void testFindAll() {
        Movie[] returned = {first, second, third,fourth, fifth};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.findAll();
        Movie[] expected = {first, second, third, fourth, fifth};

        Assertions.assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

//    @Test
//    public void test() {
//        Movie[] returned = {first, second,  third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
//        doReturn(returned).when(repository).findAll();
//
//        Movie[] actual = manager.findLast();
//        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//
//        Assertions.assertArrayEquals(expected, actual);
//
//        verify(manager).findLast();
//    }


//    Movie first = new Movie("bladshot", "Бладшот", "action");
//    Movie second = new Movie("vpered", "Вперед", "cartoon");
//    Movie third = new Movie("otel-Belgrad", "Отель Белград", "comedy");
//    Movie fourth = new Movie("dzhentlmeny", "Джентльмены", "action");
//    Movie fifth = new Movie("сhelovek-nevidimka", "Человек-невидимка", "horror");
//    Movie sixth = new Movie("trolli", "Тролли.Мировой тур", "cartoon");
//    Movie seventh = new Movie("nomer-odin", "Номер один", "comedy");
//    Movie eighth = new Movie("сhelovek-nevidimka2", "Человек-невидимка2", "horror");
//    Movie ninth = new Movie("trolli2", "Тролли.Мировой тур2", "cartoon");
//    Movie tenth = new Movie("nomer-odin2", "Номер один2", "comedy");
//
//    @Test
//    public void testSave() {
//        MovieRepository repository = new MovieRepository();
//        repository.save(first);
//        repository.save(second);
//        repository.save(third);
//        repository.save(fourth);
//        repository.save(fifth);
//        repository.save(sixth);
//        repository.save(seventh);
//
//        Movie[] actual = repository.findAll();
//        Movie[] expected = {first, second, third, fourth, fifth, sixth, seventh};
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void testRemoveById() {
//        MovieRepository repository = new MovieRepository();
//        repository.save(first);
//        repository.save(second);
//        repository.save(third);
//        repository.save(fourth);
//        repository.save(fifth);
//        repository.save(sixth);
//        repository.save(seventh);
//
//        repository.removeById("vpered");
//        Movie[] actual = repository.findAll();
//        Movie[] expected = {first, third, fourth, fifth, sixth, seventh};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testRemoveAll() {
//        MovieRepository repository = new MovieRepository();
//        repository.save(first);
//        repository.save(second);
//        repository.save(third);
//        repository.save(fourth);
//        repository.save(fifth);
//        repository.save(sixth);
//        repository.save(seventh);
//
//        Movie[] actual = repository.removeAll();
//        Movie[] expected = {};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindById() {
//        MovieRepository repository = new MovieRepository();
//        repository.save(first);
//        repository.save(second);
//        repository.save(third);
//        repository.save(fourth);
//        repository.save(fifth);
//        repository.save(sixth);
//        repository.save(seventh);
//
//        Movie actual = repository.findById("otel-Belgrad");
//        Movie expected = third;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindById2() {
//        MovieRepository repository = new MovieRepository();
//        repository.save(first);
//        repository.save(second);
//        repository.save(third);
//        repository.save(fourth);
//        repository.save(fifth);
//        repository.save(sixth);
//        repository.save(seventh);
//
//        Movie actual = repository.findById("otel-B");
//        Movie expected = null;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindLastDefault() {
//        MovieRepository repository = new MovieRepository();
//        MovieManager manager = new MovieManager(repository);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//
//        Movie[] actual = manager.findLast();
//        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindLast() {
//        MovieRepository repository = new MovieRepository(5);
//        MovieManager manager = new MovieManager(repository);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//
//        Movie[] actual = manager.findLast();
//        Movie[] expected = {tenth, ninth, eighth, seventh, sixth};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}
