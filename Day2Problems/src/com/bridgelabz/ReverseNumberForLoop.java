/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ReverseNumberForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		int temp=num;
		int i, n=0;
		
		for(i=0; num>0; num=num/10) {
			n = n*10 + (num%10);
			i++;
		}
		
		System.out.println("Original Number : "+temp + "\nReverse Number : "+n);
	}

}
