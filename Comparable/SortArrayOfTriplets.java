import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Triplet implements Comparable<Triplet> {
    int x , y , z;
    public Triplet(int x, int y, int z){
        this.x = x ;
        this.y = y;
        this.z = z;
    }
    public int compareTo(Triplet t){
        return this.z - t.z;
    }
    public String toString(){
        return "(" + x + "," + y + "," + z + ")";
    }
}


class sortUsingZComparator implements Comparator<Triplet>{
    public int compare(Triplet t1 , Triplet t2) {
        return t2.z - t1.z;
    }
}

public class SortArrayOfTriplets{

    public static void main(String[] args) {
        
       Triplet[] triplets = new Triplet[4];
       triplets[0] = new Triplet(10 , 3 , -10);
       triplets[1] = new Triplet(4 ,2 , 100);
       triplets[2] = new Triplet(9 ,6, 10);
       triplets[3] = new Triplet(3 , 4 , 1);
       Arrays.sort(triplets, new sortUsingZComparator());
       for(Triplet t : triplets)
            System.out.println(t);
    }       
}
