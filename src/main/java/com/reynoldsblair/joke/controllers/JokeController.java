package com.reynoldsblair.joke.controllers;

import com.reynoldsblair.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ed.blair on 4/19/2019.
 */
@Controller
public class JokeController {

    private JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }

}
