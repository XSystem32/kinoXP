package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scrum.kinoxp.model.Booking;
import scrum.kinoxp.model.Movie;
import scrum.kinoxp.model.Seat;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.service.BookingService;
import scrum.kinoxp.service.MovieService;
import scrum.kinoxp.service.ShowService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

    private final String INDEX = "index";
    private final String REDIRECT_INDEX = "redirect:/";
    private final String CREATE_SHOW = "createShow";
    private final String DISPLAY_SHOW = "displayShow";

    @Autowired
    ShowService showService;

    @Autowired
    MovieService movieService;

    @Autowired
    BookingService bookingService;

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
        Movie movie = movieService.getMovie(show.getMovieId());
        Booking booking = new Booking();
        booking.setShowId(show.getId());

        model.addAttribute("booking", booking);


        model.addAttribute("show", show);
        model.addAttribute("movie", movie);
        return DISPLAY_SHOW;
    }
    @RequestMapping(value = "/submitBooking", method = RequestMethod.POST)
    public String submitBooking(@ModelAttribute Booking booking){
        bookingService.createBooking(booking);
        return REDIRECT_INDEX;
    }

}
