package string;
import java.util.*;

//Write a program that takes your full name as input and displays the abbreviations
//of the first and middle name except the last name which is displayed as it is.For example 
//if your name is Robert Brett Roser, then the output should be R.B.Roser.

public class Exercise6 {

	public static void main(String[] args) {
		
		System.out.println("Enter Name::");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String sr = "";
		sr = sr+st.charAt(0);
		sr = sr+".";      
		//System.out.println(sr);
		for(int i= 0; i<st.length();i++) {
			
			if(st.charAt(i)==' ' && st.charAt(i+1)!=' ' && i+1<st.length()) {
				
				sr = (sr+st.charAt(i+1)).toUpperCase();
				sr = sr + ".";    
				
			}
		}
		//System.out.println(sr);
		
		//last word
		String last_word = "";
		for(int i= st.length()-1; i>=0;i--) {
			
			if(st.charAt(i)==' ') {
				
				last_word = st.substring(i+1);
				break;
			}
		}
		//System.out.println(last_word);
		//to remove last "."
		sr = sr.substring(0,sr.length()-2);
		sr = sr+ last_word;
		System.out.println(sr);

	}

}
