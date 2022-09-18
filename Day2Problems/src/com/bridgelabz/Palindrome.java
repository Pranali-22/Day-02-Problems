/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		int temp=num;
		int i=0, n=0;
		
		for(; num>0; num=num/10) {
			n = n*10 + (num%10);
			i++;
		}
		
		System.out.println("Original Number : "+temp + "\nReverse Number : "+n);
		
		if(temp==n) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}

}
