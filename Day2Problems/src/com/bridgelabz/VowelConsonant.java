/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class VowelConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		char c= sc.next().charAt(0);
		char isVowel='n';
		
		switch(c) {
		case 'a':
			isVowel='y';
			//System.out.println("a");
			break;
			
		case 'e':
			isVowel='y';
			//System.out.println("e");
			break;
			
		case 'i':
			isVowel='y';
			break;
			
		case 'o':
			isVowel='y';
			break;
			
		case 'u':
			isVowel='y';
			break;
			
		case 'A':
			isVowel='y';
			break;
			
		case 'E':
			isVowel='y';
			break;
			
		case 'I':
			isVowel='y';
			break;
			
		case 'O':
			isVowel='y';
			break;
			
		case 'U':
			isVowel='y';
			break;
			
		default:
			isVowel='n';
			break;
		}

		if(isVowel == 'y') {
			System.out.println("It's a vowel");
		}else {
			System.out.println("It's a consonant");
		}
	}

}
