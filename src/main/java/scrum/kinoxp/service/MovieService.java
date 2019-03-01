package scrum.kinoxp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.repository.movieRepo.MovieRepo;
import scrum.kinoxp.repository.movieRepo.MovieRepository;

import java.util.List;
@Service
public class MovieService implements MovieRepo {

    @Autowired
    MovieRepository movieRepo;

    @Override
    public boolean createMovie(Movie movie) {
        movieRepo.createMovie(movie);
        return true;
    }

    @Override
    public boolean deleteMovie(int index) {
        movieRepo.deleteMovie(index);
        return true;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        movieRepo.updateMovie(movie);
        return true;

    }

    @Override
    public Movie getMovie(String title) {
        return movieRepo.getMovie(title);
    }


    @Override
    public List<Movie> getMovies() {
        return null;
    }
}
