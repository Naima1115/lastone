package abstract_and_Interface;

public class Main {

	public static void main(String[] args) {
		
		Employee p;
		p = new Female();
		p.dressCode();
		p.dressColor();
		p= new Male();
		p.dressCode();
		p.dressColor();
		System.out.println("this is upcastinng");

	}

}
