package string;
//Write a program to check if the word 'orange' is present in the "This is orange juice".

public class Exercise4 {

	public static void main(String[] args) {
		
	String a = "This is orange juice";
	String b = "orange";
	boolean p = false;
	for(int i =0; i<= a.length();i++) {
		if(a.contains(b)) {
			p = true;
			break;
		}
	}
	System.out.println(p);

	}

}
