import java.util.*;

public class PageUp {

    public static int strStr(int[] arr , int num) {

        for(int i = 0 ; i < arr.length; i++) {

            // get elemenet 
            int ele = arr[i];

            // check , wheter it is target 
            if(ele == num)
                return i;

        }

        return -1;

    }

    public static int binarySearch(int[] arr , int num) {

        int start = 0 , end = arr.length-1 , mid = 0;

        // find mid 
        mid = start + (end - start) / 2;

        while(start <= end) {

            // element found 
            if(arr[mid] == num)
                return mid;

            // element is in right part 
            else if(num > arr[mid])
                start = mid + 1;

            // element is in left part 
            else 
                end = mid - 1;

            mid = start + (end - start) / 2;

        }

        return -1;

    }

    public static int strStr1(int[] arr , int num) {

        int index = binarySearch(arr , num);

        // System.out.println("index : "+index);

        if(index == -1)
            return -1;

        for(int i = 0 ; i <= index ; i++) {

            if(arr[i] == num) {
                index = i;
                return i;
            }

        }

        return -1;

    }

    public static ArrayList<Integer> intersection(int[] arr1 , int[] arr2) {

        ArrayList<Integer> intersaction = new ArrayList<>();

        for(int i = 0 ; i < arr1.length ; i++) {

            // get elemenet 
            int ele = arr1[i];

            // find in second array 
            for(int j = 0 ; j < arr2.length ; j++) {

                // match 
                if(ele == arr2[j])
                    intersaction.add(ele);

            }

        }

        return intersaction;

    }

    public static ArrayList<Integer> intersaction1(int[] arr1 , int[] arr2) {

        ArrayList<Integer> intersaction = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // iterate on both the array 
        int i = 0 , j = 0;
        while(i < arr1.length && j < arr2.length) {

            // get elements 
            int x = arr1[i];
            int y = arr2[j];

            // check 
            if(x == y) {
                intersaction.add(x);
                i++;
                j++;
            }

            else if(x < y)
                i++;

            else 
                j++;

        }

        return intersaction;

    }

    public static String changeCases(String str) {

        String ans = "";

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            // if it is in uppercase 
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            }

            else if(ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);

            ans = ans + ch;
        }

        return ans;
        
    }

    public static int maximizeProfit(int[] arr) {

        int maxProfit = 0;

        for(int i = 1 ; i < arr.length; i++) {

            // valley - peak logic 
            if(arr[i] > arr[i-1])
                maxProfit += arr[i] - arr[i-1];

        }

        return maxProfit;

    }

    public static String interleaving(String s1 , String s2) {

        String ans = "";

        if(s1.length() == 0 && s2.length() == 0)
            return ans;

        if(s1.length() == s2.length()) {

            for(int i = 0 ; i < s1.length() ; i++) {

                // get characters 
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);

                // add ch1 first,
                // then ch2 second
                
                ans = ans.concat(ch1+"");
                ans = ans.concat(ch2+"");

            }

        }

        else if(s1.length() != s2.length()){

            int size = Math.min(s1.length(), s2.length());

            for(int i = 0 ; i < size ; i++) {

                // get characters 
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);

                // add ch1 first,
                // then ch2 second
                
                ans = ans.concat(ch1+"");
                ans = ans.concat(ch2+"");

            }

            // System.out.println(ans);

            int i = size;
            while(i < s1.length()) {
                ans = ans.concat(s1.charAt(i)+"");
                i++;
            }
            while(i < s2.length()) {
                ans = ans.concat(s2.charAt(i)+"");
                i++;
            }

        }

        return ans;
    }

    public static Integer findInteger(String roman) {

        roman = roman.toUpperCase();

        Map<String , Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 50);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        // check for above cases 
        if(map.containsKey(roman) == true)
            return map.get(roman);

        int ans = 0;

        int i = 0;
        while(i < roman.length()) {

            if((i+1) < roman.length() && map.containsKey(roman.substring(i, i+2))) {
                ans = ans + map.get(roman.substring(i, i+2));
                i+=2;
            }
            else {
                ans = ans + map.get(roman.charAt(i)+"");
                i+=1;
            }

        }

        return ans;

    }

    public static boolean isSafe(int row , int col , int[][]sudoku , int val) {
		for(int i = 0 ; i < sudoku.length ; i++){
			if(sudoku[row][i] == val)
				return false;
			if(sudoku[i][col] == val)
				return false;
			if(sudoku[3 * (row / 3) + i/3][3 * (col / 3) + i%3] == val)
				return false;
		}

		return true;
	}

    public static boolean solve(int[][] sudoku) {

		for(int row = 0 ; row < sudoku.length ; row++) {
			for(int col = 0 ; col < sudoku[0].length ; col++) {
				// cell empty
				if(sudoku[row][col] == 0) {
					for(int val = 1 ; val <= 9 ; val++) {
						if(isSafe(row , col , sudoku , val)) {
							sudoku[row][col] = val;

							boolean recursiveAns = solve(sudoku);
							if(recursiveAns)
								return true;
							else
								// backtrack
								sudoku[row][col] = 0;
						}
					}
					return false;
				}
			}

		}

		return true;
	}

    public static void main(String[] args) {
        
        // 1st code 
        // int[] arr = {15, 5, 5, 20 , 20, 25};
        // // Arrays.sort(arr);
        // int ans = strStr(arr , 20);
        // System.out.println(ans);

        //2nd code...
        // int[] arr1 = {7, 1, 5, 2, 3, 6, 9};
        // int[] arr2 = {3, 8, 6, 20, 7 ,2 , 7 , 9};
        // ArrayList<Integer> intersaction = new ArrayList<>();
        // intersaction = intersaction1(arr2 , arr1);

        // System.out.println(intersaction);

        // 3rd code... 
        // String s = "SanDeep Patel";
        // String ans = changeCases(s);
        // System.out.println(ans);

        // 4rd code 
        // int[] arr = {7, 6, 4, 9, 1} ; 
        // int ans = maximizeProfit(arr);
        // System.out.println(ans);

        
        // 5th code 
        // String roman = "VV";
        // Integer integer = findInteger(roman);
        // System.out.println(integer);

        //7code
        // String s1 = "    " , s2 = "ckjasc";
        // String ans = interleaving(s1 , s2);
        // System.out.println(ans);
        
    }

}