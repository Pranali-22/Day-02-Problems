/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class Month {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month : ");
		int n=sc.nextInt();
		String month=null;
	
		switch(n) {
		case 1:
			month="January";
			break;
			
		case 2:
			month="February";
			break;
			
		case 3:
			month="March";
			break;
			
		case 4:
			month="April";
			break;
			
		case 5:
			month="May";
			break;
			
		case 6:
			month="June";
			break;
			
		case 7:
			month="July";
			break;
			
		case 8:
			month="August";
			break;
			
		case 9:
			month="September";
			break;
			
		case 10:
			month="October";
			break;
			
		case 11:
			month="November";
			break;
			
		case 12:
			month="December";
			break;
			
		default:
			System.out.println("Inavlid number");
			break;
		}
		
		System.out.println("Month for given number : "+month);
	}

}
