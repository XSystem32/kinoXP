package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {


        public List<Movie> movies = new ArrayList<Movie>();


    public void repoInit() {
        Movie LOTR = new Movie(1,"Lotr","asdasdasd","https://www.syfy.com/sites/syfy/files/styles/1200x680/public/wire/legacy/LOTR.png","https://www.youtube.com/watch?v=Pki6jbSbXIY","2:22");
        Movie Starwars1 = new Movie(2,"StarWars","Two Jedi Knights escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to claim their old glory.","https://m.media-amazon.com/images/M/MV5BYTRhNjcwNWQtMGJmMi00NmQyLWE2YzItODVmMTdjNWI0ZDA2XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SY999_SX666_AL_.jpg","https://www.youtube.com/watch?v=uh_YNjydvRI","1:53");
        Movie backToTheFuture = new Movie(3,"back to the future","Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.","https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,643,1000_AL_.jpg","https://www.imdb.com/title/tt0088763/videoplayer/vi252380953?ref_=tt_ov_vi","1:45" );
        Movie Starwars2 = new Movie(4,"StarWars","Ten years after initially meeting, Anakin Skywalker shares a forbidden romance with Padmé Amidala, while Obi-wan Kenobi investigates an assassination attempt on the Senator and discovers a secret clone army crafted for the Jedi.","https://m.media-amazon.com/images/M/MV5BMDAzM2M0Y2UtZjRmZi00MzVlLTg4MjEtOTE3NzU5ZDVlMTU5XkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_SY999_CR0,0,659,999_AL_.jpg","https://www.imdb.com/title/tt0121765/videoplayer/vi3723538969?ref_=tt_ov_vi","2:22");
        movies.add(LOTR);
        movies.add(Starwars1);
        movies.add(backToTheFuture);
        movies.add(Starwars2);
        
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
        for (Movie m : movies) {
            if (m.getId() == index) {
                return m;
            }
        }
        return new Movie();
    }

    @Override
    public List<Movie> getMovies() {
        return movies;
    }


    @Override
    public List<Movie> searchMovie(String title) {
        List<Movie> results = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equals(title)) {
                results.add(movies.get(i));
            }
        }
        return results;
    }

}
