package io.javabrains.movie_info_service.controller;

import io.javabrains.movie_info_service.Model.Movie;
import io.javabrains.movie_info_service.Model.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie" + movieId + "?api_keys" + apiKey , MovieSummary.class);


        return new Movie();

    }
}
