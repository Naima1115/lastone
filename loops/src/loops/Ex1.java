package loops;

//Question-1: write a program to print numbers from 1 to 10

public class Ex1 {

	public static void main(String[] args) {
		
		//System.out.println("numbers from 1 to 10:");
		//for(int i= 0; i<=10; i++) {
			//System.out.println(i);
		//}

		
		
//Question:2- Write a program to calculate the sum of first 10 natural numbers
	int i, sum;
	sum=0;
	for(i=0; i<=10; i++) {
		sum = sum+i;
	}
	System.out.println("the sum of first 10 natural numbers is:");
	System.out.println(sum);
	}

}
