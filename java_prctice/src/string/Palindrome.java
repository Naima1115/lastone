package string;

import java.util.Scanner;

//Write a java program to check if a given string is palindrome or not.
public class Palindrome {

	public static void main(String[] args) {
	
		System.out.println("Enter a string:");
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	boolean pali = false;
	for(int i=0; i<(st.length()/2); i++) {
		
		if(st.charAt(i)==st.charAt(st.length()-1-i)) {
			
			pali=true;
			break;
		}
	}
	System.out.println("The given string  is a palindrome");
	System.out.println(pali);
		

	}

}
