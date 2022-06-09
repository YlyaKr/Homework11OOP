package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Movie;
import ru.netology.repository.MovieRepository;

import java.util.Map;

//@Data
public class MovieManager {
    private MovieRepository repository;

    public MovieManager(MovieRepository repository) {
        this.repository = repository;
    }

    public void add(Movie mov) {
        repository.save(mov);
    }

    public Movie[] findAll() {
        return repository.findAll();
    }

    public Movie[] findLast() {

        Movie[] movies = repository.findAll();
        int resultLength;
        if (movies.length < repository.getMaxLength()) {
            resultLength = movies.length; ;
        } else {
            resultLength = repository.getMaxLength() ;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
