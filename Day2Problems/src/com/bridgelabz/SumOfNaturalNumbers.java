/**
 * 
 */
package com.bridgelabz;

import java.util.*;

/**
 * @author Dell
 *
 */
public class SumOfNaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
		int i=1;
		int sum=0;
		
		while(i<=num) {
			sum +=i;
			i++;
		}
		
		System.out.println(sum);
	
	}

}
