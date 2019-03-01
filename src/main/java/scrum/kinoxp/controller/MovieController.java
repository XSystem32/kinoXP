package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.service.MovieService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    private final String INDEX = "index";
    private final String REDIRECT_INDEX = "redirect:/";

    @GetMapping("/")
    public String index(Model model){
        //List<Movie> movies = movieService.getMovies();
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie());
        movies.add(new Movie());
        movies.add(new Movie());
        movies.add(new Movie());
        movies.add(new Movie());

        model.addAttribute("movies", movies);


        return INDEX;
    }



}
