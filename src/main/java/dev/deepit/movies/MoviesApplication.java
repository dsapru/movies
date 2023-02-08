package dev.deepit.movies;

import org.springframework.boot.SpringApplication; //this class contains run
import org.springframework.boot.autoconfigure.SpringBootApplication; //imports annotation - lets the compiler know about what the class does
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args); } //run is required to start spring application
}
