package nuc_zhy0340_Poly;
	
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//            关于多态         //
		//1.必须在继承体系下，子类必须继承父类
		//2.子类必须要对父类中方法进行重写
		//3.通过父类的引用调用重写的方法
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal ani = new Animal();
		
		ani.sound();
		dog.sound();
		cat.sound();
	}

}
	//这里是原始代码
    class Animal {
	   public void sound() {
	      System.out.println("The animal makes a sound");
	   }
	}

	class Cat extends Animal {
	   public void sound() {
	      System.out.println("The cat meows");
	   }
	}

	class Dog extends Animal {
	   public void sound() {
	      System.out.println("The dog barks");
	   }
	}
