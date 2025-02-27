package io.javabrains.movieCatalogueService.resources;

import io.javabrains.movieCatalogueService.model.CatalogueItem;
import io.javabrains.movieCatalogueService.model.Rating;
import io.javabrains.movieCatalogueService.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder builder;

    @RequestMapping("{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable("userId") String userId) {

        UserRating userRating = restTemplate.getForObject("https://ratings-service/" , UserRating.class);

    }
}
