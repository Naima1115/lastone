package methods;
import java.util.Scanner;

public class Static_call_static {
	
	public static double smallest(double x, double y, double z) {
		
	double min1 = (Math.min(x,y));
	double min = Math.min(z, min1);
	return min;
	}

	public static void main(String[] args) {
       
		Scanner in = new Scanner(System.in);
		System.out.println("input the first number:");
		double x = in.nextDouble();
		System.out.println("input the second number:");
		double y = in.nextDouble();
		System.out.println("input the third number:");
		double z = in.nextDouble();
		System.out.println("the smallest number is = "+" "+ smallest(x,y,z));
		
		

	}

}
