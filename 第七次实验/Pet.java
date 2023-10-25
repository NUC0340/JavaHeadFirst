package nuc_zhy0340_animals;

public class Pet {
	protected String name;
	protected String breed;
	protected String color;
	
	public Pet() {
		super();
	}
	
	public Pet(String name, String breed, String color) {
		this.name = name;
		this.breed = breed;
		this.color = color;
	}

	public void cry() {}
	
	public void speak () {
		System.out.print("我是一只" + toString() + "。我叫" + name + "，是一只" + color + "的" + breed + " 。" + "我会");
		cry();
	}
}
