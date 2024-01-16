package string;

import java.util.ArrayList;
import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		st = st.toLowerCase();
		int count = 0;
		String vow ="aeiou";
		ArrayList<Character> vowels = new ArrayList<Character>();
		
		for(int i =0; i<vow.length(); i++) {
			
			vowels.add(vow.charAt(i));
			
		}
		for(int i =0; i<st.length(); i++) {
			if(vowels.contains(st.charAt(i))) {
				count = count+1;
				
			}
			
		}
		System.out.println("Total number of vowel is:"+" "+ count);

	}

}
