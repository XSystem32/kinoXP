package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import scrum.kinoxp.model.Movie;

import java.util.List;

@Repository
public interface MovieRepo {

    public boolean createMovie (Movie movie);
    public boolean deleteMovie (int index);
    public boolean updateMovie (Movie movie);
    Movie getMovie (String title);
    List<Movie> getMovies();


}
