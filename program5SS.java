package Assignment2;

import java.util.Scanner;

public class program5SS {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		for (i=0;i<arr.length;i++) {
			System.out.println("Enter the Array Element:-");
			arr[i]=sc.nextInt();	
		}
		System.out.println("Unshorted Array:-");
		for (i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After using Selection Short Algorithm Array is");
		for (i=0;i<arr.length;i++) {
			int imin=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[imin])
					imin=j;
			}
			int temp=arr[i];
			arr[i]=arr[imin];
			arr[imin]=temp;	
			System.out.print(arr[i]+" ");
		}	
   }
}
