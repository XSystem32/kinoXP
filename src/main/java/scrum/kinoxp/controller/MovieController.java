package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.model.Theatre;
import scrum.kinoxp.repository.movieRepo.MovieRepository;
import scrum.kinoxp.service.MovieService;
import scrum.kinoxp.service.ShowService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ShowService showService;

    private final String INDEX = "index";
    private final String REDIRECT_INDEX = "redirect:/";
    private final String DISPLAY = "displayMovie";
    private final String RESULT = "resultPage";
    private final String SEARCH = "searchMovie";
    private final String CREATE_MOVIE = "createMovie";
    private final String DELETE_MOVIE = "deleteMovie";
    private final String UPDATE = "updateMovie";

    @GetMapping("/test")
    public String test(){
        movieRepository.repoInit();
        showService.repoInit();
        Theatre theatre = showService.getTheatreById(1);

        showService.createShow(new Show(0,1, new ArrayList<Booking>(), "Today ffs", theatre));

        for (Show s : showService.getShows()) {
            s.generateRows(theatre.getAmountOfRows(),theatre.getRowLength());
        }

        return REDIRECT_INDEX;
    }

    @GetMapping("/")
    public String index(Model model){

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
    @RequestMapping(value = "/createMovie", method = RequestMethod.GET)
    public String createMovie(Model model){
        model.addAttribute(new Movie());
        return CREATE_MOVIE;
    }
    @RequestMapping(value = "/submitMovie", method = RequestMethod.POST)
    public String submitMovie(Movie movie){
        movieService.createMovie(movie);
        return REDIRECT_INDEX;
    }

    @RequestMapping(value = "/deleteMovie", method = RequestMethod.GET)
    public String deleteMovie(@RequestParam(name="id")String id ){
        movieService.deleteMovie(Integer.parseInt(id));
        return REDIRECT_INDEX;
    }

    @RequestMapping(value = "/updateMovie", method = RequestMethod.GET)
    public String updateMovie(@RequestParam(name = "id") String id, Model model) {
        model.addAttribute("movie", movieService.getMovie(Integer.parseInt(id)));
        return UPDATE;
    }

    @RequestMapping("/updateMovieSubmit")
    public String updateMovie(@ModelAttribute Movie movie){
        movieService.updateMovie(movie);
        return REDIRECT_INDEX;
    }


}
