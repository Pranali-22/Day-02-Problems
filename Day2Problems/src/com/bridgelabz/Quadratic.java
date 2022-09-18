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
public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a, b & c : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		/*The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
				Root 1 of x = (-b + sqrt(delta))/(2*a)
				Root 2 of x = (-b - sqrt(delta))/(2*a)
		*/
		
		int delta = (b*b - 4*a*c);
		System.out.println("Delta : " +delta);
		
		double x1= (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of x : "+x1+"\nRoot 2 of x"+x2);
	}

}
