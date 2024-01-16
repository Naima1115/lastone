package string;

// Input a string of alphabets. Find out the number of occurrence of all
//alphabets in that string. find out the alphabet with maximum occurrence.
public class Occurance_maximum {

	static int max= 256;
	static void getOccuringChar(String str) {
		
		//creating an array of size 256
		int count[] = new int[max];
		int len = str.length();
		//loop through the string and count frequency of every character.
		for(int i=0; i<len; i++) {
			
			count[(int)str.charAt(i)]++;
		}
		//print the frequency of character
		for(int i=0; i<max; i++) {
			
			if (count[i]!=0) {
				
				System.out.println("occurance of" +" "+(char)i+"--->"+count[i]);
			}
		}
	}
	public static void main(String[] args) {
		

		String str ="helloworldandahaveagoodday";
		getOccuringChar(str);

	}

}
