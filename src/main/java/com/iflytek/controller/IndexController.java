package com.iflytek.controller;

import com.iflytek.entity.Movie;
import com.iflytek.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class IndexController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String toIndex(){
        return "index";
    }

    @GetMapping("/movie")
    public String showMovie(Long id, Model model){
        Movie movie = movieService.findById(id);
        model.addAttribute("movie", movie);
        return "movie";
    }

    @GetMapping("/movies")
    @ResponseBody
    public Object toMovieList(){
        return movieService.findAll();
    }

    @GetMapping("/likeit")
    @ResponseBody
    public Object iLikeIt(Long id){
        Integer stars = movieService.increStars(id);
        return stars;
    }

}
