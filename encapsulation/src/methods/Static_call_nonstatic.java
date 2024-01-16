package methods;

import java.util.Scanner;

public class Static_call_nonstatic {
	
	public void printMaximum(int i) {
	
		int j, max;
		max =0;
		System.out.println("the natural numbers are:");
		for(j=1; j<=i; j++) {
			
		System.out.println(j);	
		if(max<j) {
			max=j;
		}}
			System.out.println("the maximum number is:"+" " +max);
		
		
	}

	public static void main(String[] args) {
	int i,j;
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter the value of i:");
	i = input.nextInt();
	
	Static_call_nonstatic obj = new Static_call_nonstatic();
	     obj.printMaximum(i);

	}

}
