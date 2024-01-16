package string;

import java.util.Scanner;

//Write a program to find the number of vowels,consonents,
//digits and white space characters in a string.
public class Exercise7 {
	public static Scanner sc;

	public static void main(String[] args) {
		
	  String  st = "beginners book";
	    st = st.toLowerCase();
	   
		int num = 0;
		int non = 0;
		int space = 0;
		for (int i =0; i<st.length(); i++) {
			char ch = st.charAt(i);
			System.out.println(ch);
			
			if(st.charAt(i)== 'a'||st.charAt(i)== 'e'||
				st.charAt(i)=='i'||st.charAt(i)=='o' 
					|| st.charAt(i)=='u') {
				
				num = num+1;}
			
			else if(st.charAt(i)==' '){
				
			space++;	
			}
			else {
				
				non++;
			}
		}
		System.out.println("number of vowel is::" + num);
		System.out.println("Total number of consonent is:"+non);
		System.out.println("total number of space is::"+space);

	}

}
