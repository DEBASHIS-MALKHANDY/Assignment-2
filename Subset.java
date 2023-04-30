package Assignment2;

import java.util.HashSet;
import java.util.Set;

public class Subset {
	
	 public static boolean isSubset(int[] arr1, int[] arr2) {
	        Set<Integer> set = new HashSet<>();
	        for (int i = 0; i < arr1.length; i++) {
	            set.add(arr1[i]);
	        }
	        for (int i = 0; i < arr2.length; i++) {
	            if (!set.contains(arr2[i])) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {3, 4, 5};
	        if (isSubset(arr1, arr2)) {
	            System.out.println("arr2 is a subset of arr1");
	        } else {
	            System.out.println("arr2 is not a subset of arr1");
	        }
	    }



}
