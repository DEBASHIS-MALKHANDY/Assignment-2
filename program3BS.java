package Assignment2;

import java.util.Scanner;

public class program3BS {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the Array Element");
			arr[i]=sc.nextInt();	
		}
		System.out.println("Unshorted Array:-");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}				
			}
		}
		System.out.println();
		System.out.println("After Using Bubble Sort Algorithm Shorted Array is as Follow:-");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


