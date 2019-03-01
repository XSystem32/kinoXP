package scrum.kinoxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import scrum.kinoxp.service.MovieService;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;



}
