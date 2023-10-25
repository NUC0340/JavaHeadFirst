package nuc_zhy0340_animal_abstract;

public abstract class Pet implements Eatable{
	protected String name;
	protected String color;
	protected String breed;
	
	public Pet() {}

	public Pet(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	
	public abstract void cry();
	
	public abstract void eat(); // 在抽象类中可以不实现接口中的方法
	
	public void speak() {
		// 我是一只狗。我叫乐乐，是一只黑色的牧羊犬。我会汪汪汪…
		System.out.print("我是一只" + toString() + "。我叫" + name + ",是一只"  + color + "的" + breed + "。" + "我会");
		cry(); // 上转型对象实现多态
		eat(); // 接口回调实现多态
	}
	
}
