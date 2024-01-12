import java.util.*;

class Movie{

    private double ratings;
    private String name;
    private int year;
    
    public Movie(String name, double ratings, int year) {
        this.ratings = ratings;
        this.name = name;
        this.year = year;
    }

    public double getRatings() {
        return ratings;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ratings=" + ratings + ", name=" + name + ", year=" + year;
    }    

}

class ratingCompare implements Comparator<Movie> {
    @Override 
    public int compare(Movie m1, Movie m2) {
        if(m1.getRatings() < m2.getRatings())
            return -1;
        else if(m1.getRatings() > m2.getRatings())
            return 1;
        else 
            return 0;
    }
}

class NameCompare implements Comparator<Movie> {
    @Override 
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Before sorting by ratings....\n");
        for(Movie m : list)
            System.out.println(m);

        Collections.sort(list , new ratingCompare());

        System.out.println("After sorting by ratings....\n");
        for(Movie m : list)
            System.out.println(m);   
            
        System.out.println("Before sorting by names....\n");
        for(Movie m : list)
            System.out.println(m);

        Collections.sort(list , new NameCompare());

        System.out.println("After sorting by names....\n");
        for(Movie m : list)
            System.out.println(m);
    }
}
