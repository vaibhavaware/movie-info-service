package com.ivl.movieinfoservice.movieinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.movieinfoservice.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		List<Movie> movies = Arrays.asList(new Movie("movieId_1", "Transformers"),
				new Movie("movieId_2", "Fast and Furious 7"));
		return movies.stream().filter(movie -> movie.getMovieId().equalsIgnoreCase(movieId)).findAny().orElse(null);

	}

}
