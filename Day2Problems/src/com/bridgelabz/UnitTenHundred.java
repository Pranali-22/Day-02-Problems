/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class UnitTenHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("Unit");
		}else if(num==10) {
			System.out.println("Ten");
		}else if(num==100) {
			System.out.println("Hundred");
		}else if(num==1000) {
			System.out.println("Thousand");
		}

	}

}
