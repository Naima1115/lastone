package string;

//Write a java program to delete all the consonants from the string "Hello, have a good day." 
public class Delete_Consonent {

	public static void main(String[] args) {
	
		String old = "Hello have a good day";
		old = old.toLowerCase();
		int len = old.length();
		String str = "";
		for(int i=0; i<len; i++) {
			
			char ch = old.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				str = str+ch;
			}
		}
		System.out.println("the new string is:");
		System.out.println(str);
		

	}

}
