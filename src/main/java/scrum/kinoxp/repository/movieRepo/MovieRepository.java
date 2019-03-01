package scrum.kinoxp.repository.movieRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {


        public List<Movie> movies = new ArrayList<Movie>();


    public void repoInit() {
        Movie LOTR = new Movie(1,"Lort","asdasdasd","https://www.syfy.com/sites/syfy/files/styles/1200x680/public/wire/legacy/LOTR.png","https://www.youtube.com/watch?v=Pki6jbSbXIY","2:22");
        movies.add(LOTR);
        movies.add(LOTR);
        movies.add(LOTR);
        movies.add(LOTR);
        movies.add(LOTR);
        Movie movie = new Movie();


    }

    @Override
    public boolean createMovie(Movie movie) {

        return false;

    }

    @Override
    public boolean deleteMovie(int index) {

        return false;

    }

    @Override
    public boolean updateMovie(Movie movie) {

        return false;

    }

    @Override
    public Movie getMovie(int index) {

        return movies.get(index);
    }

    @Override
    public List<Movie> getMovies() {
        return getMovies();
    }
}
