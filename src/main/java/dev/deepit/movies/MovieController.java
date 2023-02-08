package dev.deepit.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() //response entity helps with front end and logging
        {
            return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
        }
    @GetMapping("/{imdbID}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbID)
    {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbID), HttpStatus.OK);
    }
}
