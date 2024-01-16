package list;
//write a program to print the numbers from 1 to 10 and print the even
// numbers and odd numbers from the arraylist seperately.
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ArrayList<Integer> even= new ArrayList<Integer>();
		ArrayList<Integer> odd= new ArrayList<Integer>();
		for(int i=1; i<11; i++) {
			ar.add(i);
		}
		for(int a:ar) {
			if(a%2==0) {
				even.add(a);
			}
			else {
				odd.add(a);
			}
		}
		for(int s:even)
			
		{System.out.println(s);
	}
		for(int j:odd) {
			System.out.println(j);
		}
	}

}
