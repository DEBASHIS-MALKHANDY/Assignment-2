package Assignment2;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int i=0,j=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			System.out.println("Enter the array element"+" "+i);
			arr[i]=sc.nextInt();
		}	
		System.out.println("the Nember is as follow");
		for(i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	     }
		System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Duplicate Value are"+" "+arr[j]+" " );
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.print("This array have no duplicate");
		}
		
	
     }
}
	
		

   

