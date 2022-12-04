package interfaces;
import classes.Movie;
import java.util.List;

public interface Findable {
     List<Movie>getAllMovies(List<Movie>movies);
     void findMovieByName(List<Movie>movies);
     void findMovieByActor(List<Movie>movies);
     void findMovieByYear(List<Movie>movies);
     void findMovieByDirector(List<Movie>movies);
     void findMovieByDescription(List<Movie>movies);
     void findMovieByRole(List<Movie>movies);
}
