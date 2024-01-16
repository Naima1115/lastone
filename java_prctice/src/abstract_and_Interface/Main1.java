package abstract_and_Interface;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println("for female employee");
		Female f= new Female();
		f.dressCode();
		f.dressColor();
		
		System.out.println("for male employee");
		Male m = new Male();
		m.dressCode();
		m.dressColor();

	}

}
