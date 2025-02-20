package io.javabrains.movie_ratings_service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
    private String movieId;
    private int rating;

}
