import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FilmCollection extends Film{
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> films = new ArrayList<>();
    HashSet<String> filmler = new HashSet<>();
    HashMap<String,String> movie = new HashMap<>();

    public void addFilm(){
        System.out.println("Enter film name: ");
        filmler.add(filmName = scanner.next());
        System.out.println("Enter film janr: ");
        filmler.add(filmJanr = scanner.next());
        System.out.println("Enter film year: ");
        filmler.add(year = scanner.next());
        System.out.println("Film added!");
        films.add(filmName);
        films.add(filmJanr);
        films.add(year);
        movie.put(filmJanr,filmName);
        System.out.println(films);
    }

    public void removeFilm(){
        System.out.println("Which film do you want to delete?");
        filmName = scanner.next();
        films.remove(filmName);
        System.out.println("Film deleted!");
        System.out.println(films);
    }

    public void searchFilm(){
        System.out.println("Movies by genre: Enter genre: ");
        movie.get(filmJanr = scanner.next());
        System.out.println(movie);
    }

    public void allFilm(){
        System.out.println("All Films! ");
        System.out.println(films);
    }


}
