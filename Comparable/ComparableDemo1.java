import java.util.*;

class Movie implements Comparable<Movie>{

    private double ratings;
    private String name;
    private int year;

    @Override
    public String toString() {
        return "ratings=" + ratings + ", name=" + name + ", year=" + year;
    }

    public Movie(String name , double ratings , int year) {
        this.ratings = ratings;
        this.name = name;
        this.year = year;
    }

    @Override 
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

}

public class ComparableDemo1{

    public static void main(String[] args) {
        
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Movies before sorting....");
        for(Movie m : list)
            System.out.println(m);

        Collections.sort(list);

        System.out.println("Movies after sorting...");
        for(Movie m : list)
            System.out.println(m);

    }

}