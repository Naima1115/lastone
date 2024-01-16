//1.write a program to create a class called person with private instance variables name,age,country
//applied public getter and setter method.

package encapsulations;

public class Test1 {
	
	private String name;
	private int age;
	private String country;
	
	public String getname() {
		return name;
	}
	public void setname (String name) {
		this.name= name;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age= age;
	}
	
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country= country;
	}

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		//set values
		obj.setname("naima");
		obj.setage(32);
		obj.setcountry("bangladesh");
		//get values
		String name= obj.getname();
		int age= obj.getage();
		String country= obj.getcountry();
		
		//print values
		System.out.println("name:"+" "+name);
		System.out.println("age:"+" "+age);
		System.out.println("country:"+" "+country);

	}

}
