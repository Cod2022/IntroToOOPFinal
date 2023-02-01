package service;

import models.Movie;

public interface IFilmService {

    Movie getMovie(String movieName);
    void addMovie(Movie movie);
    void editMovie(Movie movie);
    void deleteMovie(Movie movie);
}
