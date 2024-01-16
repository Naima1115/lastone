package methods;

public class Nonstatic_call_static {
	
	public static int add() {
		 
		int a= 10;
		int b= 20;
		int sum = a+b;
		return sum;
	}
	
	public void divide() {
		
		int c = 3;
		int d = add();
		double divide = d/c;
		System.out.println("the value is:"+" "+ divide);
		
	}

	public static void main(String[] args) {
		
	Nonstatic_call_static obj = new Nonstatic_call_static();
	obj.divide();
	}

}
