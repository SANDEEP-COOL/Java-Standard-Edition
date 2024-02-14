import java.util.*;
class Movie implements Comparable<Movie>
{

    private double ratings;
    private String name;
    private int year;

    public double getRatings(){
        return ratings;
    }

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

class RatingsComparator implements Comparator<Movie>{
    @Override 
    public int compare(Movie m1 , Movie m2) {
        double m1Rating = m1.getRatings();
        double m2Rating = m2.getRatings();
        if(m1Rating == m2Rating)
            return 0;
        else if(m1Rating < m2Rating)    
            return -1;
        else 
            return 1;
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

        Collections.sort(list , new RatingsComparator());

        System.out.println("Movies after sorting...");
        for(Movie m : list)
            System.out.println(m);

    }

}