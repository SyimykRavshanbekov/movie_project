import classes.Cast;
import classes.Director;
import classes.Movie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director1 = new Director("Nursultan", "Ganiev");
        Director director2 = new Director("Akylbek", "Japarov");
        Director director3 = new Director("Sadyr", "Japarov");
        Director director4= new Director("Ulukbek", "Kochrov");
        Director director5= new Director("Samarbek", "Ashym Uulu");

        LinkedList<Cast> casts1 = new LinkedList<>();
        casts1.add(new Cast("Macaulay Culkin", "Kevin"));

        LinkedList<Cast> casts2 = new LinkedList<>();
        casts2.add(new Cast("Daniel Radcliffe", "Harry"));

        LinkedList<Cast> casts3 = new LinkedList<>();
        casts3.add(new Cast("Glen Powell", "Max"));

        LinkedList<Cast> casts4 = new LinkedList<>();
        casts4.add(new Cast("Owen Wilson", "Mc.Queen"));

        LinkedList<Cast> casts5 = new LinkedList<>();
        casts5.add(new Cast("Jenna Ortega", "Wednesday Addams"));


        Movie movie = new Movie();
        LinkedList<Movie> movies = new LinkedList<>();
        movies.add(new Movie("Home alone", 1990, "comedy", director1, casts1));
        movies.add(new Movie("Harry Potter", 2001, "fantastic", director2, casts2));
        movies.add(new Movie("Devotion", 2022, "action", director3, casts3));
        movies.add(new Movie("Cars", 2006, "cartoon", director4, casts4));
        movies.add(new Movie("Wednesday", 2022, "crime", director5, casts5));


        while (true){
            System.out.println("""
                   \n-----------------------------------
                   1 -> all movies
                   2 -> find movie by name
                   3 -> find movie by actors name
                   4 -> find movie by issue year
                   5 -> find movie by director name
                   6 -> find movie by description
                   7 -> find movie by role
                   8 -> sort movie by name A to Z
                   9 -> sort movie by name Z to A
                   10 -> sort movie by issue year ascending
                   11 -> sort movie by issue year descending
                   12 -> sort movie by director
                   ------------------------------------
                    """);
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("===================*MOVIES*===================");
                    movie.getAllMovies(movies).forEach(System.out::println);
                }
                case 2 -> movie.findMovieByName(movies);
                case 3 -> movie.findMovieByActor(movies);
                case 4 -> movie.findMovieByYear(movies);
                case 5 -> movie.findMovieByDirector(movies);
                case 6 -> movie.findMovieByDescription(movies);
                case 7 -> movie.findMovieByRole(movies);
                case 8 -> movie.sortByMovieNameAToZ(movies);
                case 9 -> movie.sortByMovieNameZToA(movies);
                case 10 -> movie.sortByYearAscending(movies);
                case 11 -> movie.sortByYearDescending(movies);
                case 12 -> movie.sortByDirector(movies);
            }
        }
    }
}