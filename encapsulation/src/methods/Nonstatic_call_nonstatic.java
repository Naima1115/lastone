package methods;

public class Nonstatic_call_nonstatic {
	
	public double add() {
		
		double a= 2.5;
		double b= 3.5;
		return (a+b);
			
	}
	
	public void multi() {
		
		int c=12;
		Nonstatic_call_nonstatic obj= new Nonstatic_call_nonstatic();
		double d= obj.add();
		double ml= c*d;
		System.out.println("the multiplication is:"+" "+ml);
	}

	public static void main(String[] args) {
		
		Nonstatic_call_nonstatic ob= new Nonstatic_call_nonstatic();
		ob.multi();

	}

}
