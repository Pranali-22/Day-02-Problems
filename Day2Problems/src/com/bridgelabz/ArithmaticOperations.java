/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class ArithmaticOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		float a=sc.nextFloat();
		System.out.println("Enter value of b : ");
		float b=sc.nextFloat();
		System.out.println("Enter value of c : ");
		float c=sc.nextFloat();
		
		float res1 = a+b*c;
		float res2 = c+a/b;
		float res3 = a%b+c;
		float res4 = a*b+c;
		
		System.out.println(res1+"\n"+res2+"\n"+res3+"\n"+res4);
		float max=res1, min=res1;
		
		//maximum  among result
		if(max < res2) {
			max=res2;
		}else if(max < res3) {
			max=res3;
		}else if(max < res4) {
			max=res4;
		}
		
		//minimum among result
		if(min > res2) {
			min=res2;
		}else if(min > res3) {
			min=res3;
		}else if(min > res4) {
			min=res4;
		}
		
		System.out.println("Maximum among the result : "+max);
		System.out.println("Minimum among the result : "+min);
	}

}
