import java.util.Arrays;



public class ArraysClassMethods {

    public static void main(String[] args) {
        
        Integer arr[] = {10, 20, 15, 22, 35};
        // Integer arr1[] = {10, 20, 15, 22, 35};
        Integer arr1[] = arr;

        // #asList 
        // System.out.println("Integer array as arraylist : "+Arrays.asList(arr));

        // #binary search 
        // Arrays.sort(arr);
        // System.out.println("22 is in "+Arrays.binarySearch(arr, 22)+" index");

        // #binary search in range 
        // Arrays.sort(arr);
        // System.out.println("22 searching in range between 0 index to 2 index : "+Arrays.binarySearch(arr, 0, 4, 22));

        // #arrays refercence - same refernce - return 0
        // arrays length - if first array's length is greater it returns 1 , and if length of both arrays are same then 0, otherwise -1
        // arrays element - compares lexicographically - if finds unequeal ele then returns difference of those unequal elements
        // and if both arrays are exactly equal then it returns 0
        // System.out.println("arrays length are not same : "+Arrays.compare(arr, arr1)); -- comes java 9 onwards

        // #copy of 
        // System.out.println("copy of arr : "+Arrays.toString(Arrays.copyOf(arr, 10)));

        // #COPY OF RANGE 
        // System.out.println("copy in range : "+Arrays.toString(Arrays.copyOfRange(arr, 1, 9)));

        // #DEEP EQUALS 
        // System.out.println("Integer arrays on comparison : "+Arrays.deepEquals(arr, arr1));

        // #DEEP HASH CODE
        // System.out.println(Arrays.deepHashCode(arr1));

        // #TO STRING 
        // System.out.println(Arrays.deepToString(arr));

        // #EQUALS 
        // System.out.println(Arrays.equals(arr, arr1));

        // #FILL
        // Arrays.fill(arr, 10);
        // System.out.println(Arrays.toString(arr));

        // #HASHCODE
        // System.out.println(Arrays.hashCode(arr));

        // #MISMATCH INDEX
        // System.out.println(Arrays.mismatch(arr, arr1)) ; 

        // #PARALLEL SORT 
        // Arrays.parallelSort(arr);
        // System.out.println(Arrays.toString(arr));

        // #SORT 
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // #SORT IN RANGE
        // Arrays.sort(2, 3);

    }
    
}
