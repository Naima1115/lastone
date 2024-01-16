package loops;

//Question:3- Write a program that prompts the user to input a positive
//integer. It should then print the multiplication table of that number
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("the number is:");
		int i, x;
		x= obj.nextInt();
		System.out.println("the multiplication table is:");
		for(i=1; i<=10; i++) {
			System.out.println(x +"*"+ i +"=" +(x*i));
		}
	
	}

}
