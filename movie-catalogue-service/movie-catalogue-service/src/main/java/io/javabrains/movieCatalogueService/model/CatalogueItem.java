package io.javabrains.movieCatalogueService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CatalogueItem {

    private String name;
    private String desc;
    private int rating;
}
