package scrum.kinoxp.repository.movieRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class MovieRepository implements MovieRepo {


    public List<Movie> movies = new ArrayList<Movie>();


    public void repoInit() {
        movies.add(new Movie(1,"Lotr","A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
        movies.add(new Movie(2,"StarWars","Two Jedi Knights escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to claim their old glory.","https://m.media-amazon.com/images/M/MV5BYTRhNjcwNWQtMGJmMi00NmQyLWE2YzItODVmMTdjNWI0ZDA2XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SY999_SX666_AL_.jpg","https://www.imdb.com/videoembed/vi2143788569","1:53"));
        movies.add(new Movie(3,"back to the future","Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.","https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,643,1000_AL_.jpg","https://www.imdb.com/videoembed/vi252380953","1:45" ));
        movies.add(new Movie(4,"StarWars","Ten years after initially meeting, Anakin Skywalker shares a forbidden romance with Padmé Amidala, while Obi-wan Kenobi investigates an assassination attempt on the Senator and discovers a secret clone army crafted for the Jedi.","https://m.media-amazon.com/images/M/MV5BMDAzM2M0Y2UtZjRmZi00MzVlLTg4MjEtOTE3NzU5ZDVlMTU5XkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_SY999_CR0,0,659,999_AL_.jpg","https://www.imdb.com/videoembed/vi3723538969","2:22"));
        movies.add(new Movie(5,"No Country For Old Man","A veteran hunter finds the case with lots of money and shit starts to happen","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
        movies.add(new Movie(6,"In Brugges","Assasin accidentally kills a kid and is sent by his boss in Brugges, Belgium, where some shit starts to happen","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
        movies.add(new Movie(7,"Silence","Two christian priestes goes to Japan to find their master and shit starts happening","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
        movies.add(new Movie(8,"Brave Heart","William Wallace makes a riot against England and shit starts to happen","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
        movies.add(new Movie(9,"Terminator","Robot comes from future and shit is happening already","https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg","https://www.imdb.com/videoembed/vi2073101337","2:22"));
    }

    @Override
    public boolean createMovie(Movie movie) {
        movies.add(movie);
        return false;
    }

    @Override
    public boolean deleteMovie(int id) {
        int toBeDeleted = -1;
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id){
                toBeDeleted = i;
                break;
            }
        }
        if (toBeDeleted != -1) {
            movies.remove(toBeDeleted);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        int oldMovieIndex = -1;

        for (int i = 0; i < movies.size(); i++){
            if (movie.getId() == movies.get(i).getId()) {
                oldMovieIndex = i;
                break;
            }
        }

        movies.set(oldMovieIndex, movie);

        return false;
    }

    @Override
    public Movie getMovie(int id) {
        for (Movie m : movies) {
            if (m.getId() == id) {
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

        title = title.toLowerCase();

        List<Movie> results = new ArrayList<>();

        for (Movie m : movies) {
            if (m.getTitle().toLowerCase().contains(title)) {
                results.add(m);
            }
        }
        return results;
    }
}
