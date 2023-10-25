package nuc_zhy0340_animals;

public class Cat extends Pet{
	public Cat (String name, String breed, String color) {
		super(name, breed, color);
	}
	
	public void cry () {
		System.out.println("喵喵喵...");
	}
	
	public String toString () {
		return "猫";
	}
}
