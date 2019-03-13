package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.service.MovieService;
import scrum.kinoxp.service.ShowService;

@Controller
public class ShowController {

    private final String INDEX = "index";
    private final String REDIRECT_INDEX = "redirect:/";
    private final String CREATE_SHOW = "createShow";

    @Autowired
    ShowService showService;

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/createShow", method = RequestMethod.GET)
    public String createMovie(Model model){
        model.addAttribute("movies", movieService.getMovies());
        model.addAttribute("show", new Show());
        return CREATE_SHOW;
    }

    @RequestMapping(value = "/submitShow", method = RequestMethod.POST)
    public String submitShow(@ModelAttribute Show show){
        showService.createShow(show);
        return REDIRECT_INDEX;
    }

    @RequestMapping(value = "/displayShow", method = RequestMethod.GET)
    public String displayShow(@RequestParam(name="id") String id, Model model){
        Show show = showService.getShow(Integer.parseInt(id));
        Movie movie = movieService.getMovie(show.get)
        model.addAttribute()
        showService.createShow(show);
        return REDIRECT_INDEX;
    }

}
