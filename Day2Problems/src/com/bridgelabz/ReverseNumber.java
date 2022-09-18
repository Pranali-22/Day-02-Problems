/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import java.math.*;
/**
 * @author Dell
 *
 */
public class ReverseNumber {

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
		
		while(num>0) {
			n = n*10 + (num%10);
			i++;
			num = num/10;
		}
				
		System.out.println("Original Number : "+temp + "\nReverse Number : "+n);
	}

}
