package inheritance;

public class EX1_Dog extends EX1_Animal {
	
	public void eat() {
		
		super.eat();
		System.out.println("I eat dog food");
	}
	
	public void bark() {
		
		System.out.println("I can bark");
	}

}
