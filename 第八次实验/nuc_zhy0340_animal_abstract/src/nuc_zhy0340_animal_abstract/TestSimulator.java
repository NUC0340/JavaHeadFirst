package nuc_zhy0340_animal_abstract;

public class TestSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator s = new Simulator();
		s.playSound(new Dog("Dog","白色","牧羊犬"));
		s.playSound(new Cat("Cat","黑色","橘猫"));
	}

}
