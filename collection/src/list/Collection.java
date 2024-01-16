package list;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Collection {
	
	// create a method to enter the country name
	static List name() {
		
		ArrayList<String> countryName= new ArrayList<>();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter country name");
		for(int i=1; i<6; i++) {
			countryName.add(obj.nextLine());
		}
		return countryName;
	}
	
	
	//create a method to add 1-10 integer number
	
	static List numbers() {
		ArrayList<Integer> number= new ArrayList<>();
		for(int i=1; i<11; i++) {
			number.add(i);
		}
		return number;
	}
	
	// add 11-15 number to previous number
	static List allnumbers() {
		ArrayList<Integer> allnumber= new ArrayList<>();
		allnumber.addAll(numbers());
		for(int i=11; i<16; i++) {
			allnumber.add(i);
		}
		return allnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a= Collection.name();
		List b= Collection.numbers();
		List c= Collection.allnumbers();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
