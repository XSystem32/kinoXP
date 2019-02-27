package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import scrum.kinoxp.model.Movie;

import java.util.List;

@Repository
public interface MovieRepo {

    public void createMovie (Movie movie);
    public void readMovie (int index);
    public void updateMovie (Movie movie);
    Movie getMovie (int index);
    List<Movie> getMovies();


}
