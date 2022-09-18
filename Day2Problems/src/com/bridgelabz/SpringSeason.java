/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class SpringSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for m and d respectivey : ");
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		//(m = 3, d=20) and June 20 (m = 6, d = 20)
		
		if(m==3 && d<20 || m==6 && d>20)
		{
			System.out.println("False");
		}else if(m>=3 && m<=6) {
				System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
