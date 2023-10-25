package nuc_zhy0340_animal_abstract;

public class Dog extends Pet{
	public Dog(String name, String color, String breed) {
		super(name,color,breed);
	}
	
	public void cry() {
		System.out.println("汪汪汪....");
	}
	
	public void eat() {
		System.out.println("吃骨头");
	}

	public String toString() {
		return "狗";
	}
}
