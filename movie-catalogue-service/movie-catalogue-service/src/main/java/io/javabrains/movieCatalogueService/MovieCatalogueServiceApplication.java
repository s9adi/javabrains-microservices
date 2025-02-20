package io.javabrains.movieCatalogueService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebBuilder(){
		return WebClient.builder();
	}
}
