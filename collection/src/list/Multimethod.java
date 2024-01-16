
package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Multimethod {
	static ArrayList<String> name() {
	Scanner obj= new Scanner(System.in);
	
	ArrayList<String> n= new ArrayList<String>();
	System.out.println("Enter name");
	for(int i=1; i<6; i++) {
		n.add(obj.next());
	}
	if(n.contains("naima")) {
		System.out.println("valid");
	}
	else {System.out.println("invalid");
	}
	return n;
		
	}
	static ArrayList<Integer> number() {
		ArrayList<Integer> n= new ArrayList<Integer>();
		for(int j=1; j<6; j++) {
			n.add(j);
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Multimethod.number());
		System.out.println(Multimethod.name());

	}

}
