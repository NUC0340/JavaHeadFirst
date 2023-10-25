package nuc_zhy0340_animals;

public class Dog extends Pet{
	public Dog (String name, String breed, String color) {
		super(name, breed, color);
	}
	
	public void cry() {
		System.out.println("汪汪汪...");
	}
	
	public String toString() {
		return "狗";
	}
 }
