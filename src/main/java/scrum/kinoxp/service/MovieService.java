package scrum.kinoxp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.repository.movieRepo.MovieRepo;
import scrum.kinoxp.repository.movieRepo.MovieRepository;
import scrum.kinoxp.repository.showRepo.ShowRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class MovieService implements MovieRepo {

    @Autowired
    MovieRepository movieRepo;

    @Autowired
    ShowRepository showRepository;

    @Override
    public boolean createMovie(Movie movie) {
        movieRepo.createMovie(movie);
        return true;
    }

    @Override
    public boolean deleteMovie(int id) {
        movieRepo.deleteMovie(id);
        return true;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        movieRepo.updateMovie(movie);
        return true;

    }

    @Override
    public Movie getMovie(int id) {
        Movie movie = movieRepo.getMovie(id);
        ArrayList<Show> shows = showRepository.getShowsByMovieId(id);

        movie.setShows(shows);
        return movie;

    }


    @Override
    public List<Movie> getMovies() {
        return movieRepo.getMovies();
    }

    public List<Movie> searchMovie (String title) {
        return movieRepo.searchMovie(title);
    }
}
