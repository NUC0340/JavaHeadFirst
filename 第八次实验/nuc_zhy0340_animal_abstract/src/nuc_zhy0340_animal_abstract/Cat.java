package nuc_zhy0340_animal_abstract;

public class Cat extends Pet{
	
		public Cat(String name, String color, String breed) {
			super(name,color,breed);
		}
		
		public void cry() {
			System.out.println("喵喵喵....");
		}
		
		public void eat() {
			System.out.println("吃鱼");
		}

		public String toString() {
			return "猫";
		}
}
