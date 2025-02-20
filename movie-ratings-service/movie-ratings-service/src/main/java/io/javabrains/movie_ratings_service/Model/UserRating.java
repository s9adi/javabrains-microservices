package io.javabrains.movie_ratings_service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRating {

    private String userId;
    private List<Rating> ratings;

}
