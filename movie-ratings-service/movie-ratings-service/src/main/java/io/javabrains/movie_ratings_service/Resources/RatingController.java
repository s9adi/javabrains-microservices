package io.javabrains.movie_ratings_service.Resources;

import io.javabrains.movie_ratings_service.Model.Rating;
import io.javabrains.movie_ratings_service.Model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/movies/{movieId}")
    public Rating getRatingsByMovieId(@PathVariable("movieId") String movieId){
        return new Rating(movieId , 4);
    }
}
