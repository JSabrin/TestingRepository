package TestCases;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {10, -30, 50, 60, 100, 150, -88, 78549};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		//using for loop:
		//Time complexity = O(n)
		
		for(int i=1; i<numbers.length; i++){
			 if(numbers[i]>largest){
				 largest = numbers[i]; //78549
			 }else if(numbers[i]<smallest){
				 smallest = numbers[i]; //-88
			 }
			 
		}
		System.out.println("\n given Array is ::"+ Arrays.toString(numbers));
		System.out.println("Largest number is ::"+ largest);
		System.out.println("Smallest number is ::"+ smallest);
		
		
	}

}
