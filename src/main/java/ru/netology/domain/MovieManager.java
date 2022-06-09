package ru.netology.domain;

import lombok.Data;

@Data
public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int maxLength = 10;

    public MovieManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public MovieManager() {

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

    public Movie[] findLast() {
        Movie[] movies = findAll();
        int resultLength;
        if (movies.length < maxLength) {
            resultLength = movies.length;
        } else {
            resultLength = maxLength;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}