package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.repository.movieRepo.MovieRepository;
import scrum.kinoxp.service.MovieService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    private final String INDEX = "index";
    private final String REDIRECT_INDEX = "redirect:/";

    @GetMapping("/")
    public String index(Model model){
        movieRepository.repoInit();

        List<Movie> movies = movieService.getMovies();
        model.addAttribute("movies", movies);

        return INDEX;
    }



}
