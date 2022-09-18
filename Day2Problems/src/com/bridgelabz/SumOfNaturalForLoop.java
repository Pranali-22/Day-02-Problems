/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class SumOfNaturalForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
		int i;
		int sum=0;
		
		for(i=1;i<=num;i++) {
			sum +=i;
		}
		
		System.out.println(sum);
	
	}

}
