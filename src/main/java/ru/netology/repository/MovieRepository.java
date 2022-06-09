package ru.netology.repository;

import lombok.Data;
import ru.netology.domain.Movie;

@Data

public class MovieRepository {
    private Movie[] movies = new Movie[0];
    private int maxLength = 10;

    public MovieRepository(int maxLength) {
        this.maxLength = maxLength;
    }

    public MovieRepository() {

    }

    public void save(Movie mov) {
        Movie[] tmp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = mov;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public void removeById(String id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int index = 0;
        for (Movie mov : movies) {
            if (mov.getId() != id) {
                tmp[index] = mov;
                index++;
            }
        }
        movies = tmp;
    }

    public Movie findById(String id) {
        for (Movie mov : movies) {
            if (mov.getId() == id) {
                return mov;
            }
        }
        return null;
    }

    public Movie[] removeAll() {
        return movies = new Movie[0];

    }
}
