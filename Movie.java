/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentalmachine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class Movie {

    private String movieName;
    private String movieCast;
    private int movieRating;
    private String movieGenre;

    /**
     * @return the movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName the movieName to set
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * @return the movieCast
     */
    public String getMovieCast() {
        return movieCast;
    }

    /**
     * @param movieCast the movieCast to set
     */
    public void setMovieCast(String movieCast) {
        this.movieCast = movieCast;
    }

    /**
     * @return the movieRating
     */
    public int getMovieRating() {
        return movieRating;
    }

    /**
     * @param movieRating the movieRating to set
     */
    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    /**
     * @return the movieGenre
     */
    public String getMovieGenre() {
        return movieGenre;
    }

    /**
     * @param movieGenre the movieGenre to set
     */
    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public static List<Movie> initialiseMovies() {

        List<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie();
        movie1.setMovieName("Inception");
        movie1.setMovieCast("Leonardo DiCaprio");
        movie1.setMovieGenre("SciFi");
        movies.add(movie1);

        Movie movie2 = new Movie();
        movie2.setMovieName("Interstellar");
        movie2.setMovieCast("Anne Hathaway");
        movie2.setMovieGenre("Thriller");
        movies.add(movie2);

        Movie movie3 = new Movie();
        movie3.setMovieName("Batman");
        movie3.setMovieCast("Cristian Bale");
        movie3.setMovieGenre("Comic");
        movies.add(movie3);

        return movies;
    }
}
