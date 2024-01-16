package polymorphism;

public class A5_main {

	public static void main(String[] args) {
		
		A1_food food;
		food = new A1_food();
		food.eat();
		food = new A2_breakfast();
		food.eat();
		food = new A3_lunch();
		food.eat();
		food = new A4_dinner();
		food.eat();
		
		System.out.println("this is call upcasting and the object variable food is called polymorphic variable");

	}

}
