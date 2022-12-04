import classes.Cast;
import classes.Director;
import classes.Movie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Director director1 = new Director("Chris", "Columbus");
        Director director2 = new Director("Chris", "Columbus");
        Director director3 = new Director("D", "Dillard");
        Director director4= new Director("Joe", "Ranft");
        Director director5= new Director("Alfred", "Gough");

        LinkedList<Cast> casts1 = new LinkedList<>();
        Cast cast1 = new Cast("Macaulay Culkin", "Kevin");
        casts1.add(cast1);

        LinkedList<Cast> casts2 = new LinkedList<>();
        Cast cast2 = new Cast("Daniel Radcliffe", "Harry");
        casts2.add(cast2);

        LinkedList<Cast> casts3 = new LinkedList<>();
        Cast cast3 = new Cast("Glen Powell", "Max");
        casts3.add(cast3);

        LinkedList<Cast> casts4 = new LinkedList<>();
        Cast cast4 = new Cast("Owen Wilson", "Mc.Queen");
        casts4.add(cast4);

        LinkedList<Cast> casts5 = new LinkedList<>();
        Cast cast5 = new Cast("Jenna Ortega", "Wednesday Addams");
        casts5.add(cast5);


        Movie movie = new Movie();
        Movie movie1 = new Movie("Home alone", 1990, "comedy", director1, casts1);
        Movie movie2 = new Movie("Harry Potter", 2001, "fantastic", director2, casts2);
        Movie movie3 = new Movie("Devotion", 2022, "action", director3, casts3);
        Movie movie4 = new Movie("Cars", 2006, "cartoon", director4, casts4);
        Movie movie5 = new Movie("Wednesday", 2022, "crime", director5, casts5);

        LinkedList<Movie>movies = new LinkedList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        while (true){
            System.out.println("""
                   \n0 -> all movies
                   1 -> find movie by name
                   2 -> find movie by actors name
                   3 -> find movie by issue year
                   4 -> find movie by director name
                   5 -> find movie by description
                   6 -> find movie by role
                   7 -> sort movie by name A to Z
                   8 -> sort movie by name Z to A
                   9 -> sort movie by issue year ascending
                   10 -> sort movie by issue year descending
                   11 -> sort movie by director
                    """);
            switch (input.nextInt()) {
                case 0 -> {
                    System.out.println("===================*Movies*===================");
                    for (Movie allMovie : movie.getAllMovies(movies)) {
                        System.out.println(allMovie);
                    }
                }
                case 1 -> movie.findMovieByName(movies);//name
                case 2 -> movie.findMovieByActor(movies);//actor
                case 3 -> movie.findMovieByYear(movies);//year
                case 4 -> movie.findMovieByDirector(movies);//director
                case 5 -> movie.findMovieByDescription(movies);//description
                case 6 -> movie.findMovieByRole(movies);//role
                case 7 -> movie.sortByMovieNameAToZ(movies);//a to z
                case 8 -> movie.sortByMovieNameZToA(movies);//z to a
                case 9 -> movie.sortByYearAscending(movies);//ascending
                case 10 -> movie.sortByYearDescending(movies);//descending
                case 11 -> movie.sortByDirector(movies);//director sort
            }
        }
    }
}