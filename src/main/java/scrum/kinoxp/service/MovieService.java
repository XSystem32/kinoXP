package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.repository.movieRepo.MovieRepo;
import scrum.kinoxp.repository.movieRepo.MovieRepository;

import java.util.List;

public class MovieService implements MovieRepo {

    @Autowired
    MovieRepository movieRepo;

    @Override
    public void createMovie(Movie movie) {
        movieRepo.createMovie(movie);
        return true;
    }

    @Override
    public void deleteMovie(int index) {
        movieRepo.deleteMovie(index);
        return true;
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepo.updateMovie(movie);
        return true;

    }

    @Override
    public Movie getMovie(int index) {
        return movieRepo.getMovie(index);
    }

    @Override
    public List<Movie> getMovies() {
        return null;
    }
}
