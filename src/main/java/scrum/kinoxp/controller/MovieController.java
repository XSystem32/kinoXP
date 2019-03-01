package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    private final String DISPLAY = "displayMovie";
    private final String RESULT = "resultPage";
    private final String SEARCH = "searchMovie";


    @GetMapping("/")
    public String index(Model model){
        movieRepository.repoInit();

        List<Movie> movies = movieService.getMovies();
        model.addAttribute("movies", movies);

        return INDEX;
    }

    @RequestMapping(value = "/displayMovie", method = RequestMethod.GET)
    public String displayMovie(@RequestParam(name="id") String id, Model model){
        Movie movie = movieService.getMovie(Integer.parseInt(id));
        model.addAttribute("movie", movie);
        return DISPLAY;
    }

    @RequestMapping(value = "/searchMovie", method = RequestMethod.POST)
    public String searchMovie(@RequestParam(name="search") String search, Model model){
        model.addAttribute("movies",movieService.searchMovie(search) );
        return RESULT;
    }






}
