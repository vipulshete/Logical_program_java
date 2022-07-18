package com.bridgelab.logical;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse of the given number is: ");    
		
			if (num < 10) {  
			System.out.println(num);  
			return;  
			} else {  
			System.out.print(num % 10);   
			} 
	}

}
