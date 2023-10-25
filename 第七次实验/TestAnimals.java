package nuc_zhy0340_animals;

import java.util.Scanner;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("********************");
			System.out.println("****选择你的宠物******");
			System.out.println("*****1.狗子*********");
			System.out.println("*****2.猫儿*********");
			System.out.println("*****3.退出**********");
			System.out.println("********************");
			int choose = sc.nextInt();
			switch (choose) {
				case 1 : {
					System.out.println("请输入修勾的名字，品种，颜色：");
					String name = sc.next();
					String breed = sc.next();
					String color = sc.next();	
					Pet dog = new Dog(name, breed, color);
					dog.toString();
					dog.speak();
					break;
				}
				case 2 : {
					System.out.println("请输入修猫的名字，品种，颜色：");
					String name = sc.next();
					String breed = sc.next();
					String color = sc.next();	
					Pet cat = new Cat(name, breed, color);
					cat.toString();
					cat.speak();
					break;
				}
				case 3 : {}
					return;
			}
	    }
	}
}
