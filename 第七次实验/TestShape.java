package nuc_zhy0340_shape;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("*********************");
			System.out.println("*********1.圆********");
			System.out.println("*********2.长方形*****");
			System.out.println("*********3.结束*******");
			System.out.println("*********************");
			System.out.println("请输入你要进行的选择：");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
				case 1 : {
					System.out.println("请输入圆的半径，颜色以及是否填满：");
					float radius = sc.nextFloat();
					String color = sc.next();
					boolean filled = sc.nextBoolean();
					Geometric circle = new Circle(radius, color ,filled);
					System.out.println(circle.toString());
					break;
				}
				case 2 : {
					System.out.println("请输入长方形的长，宽，颜色以及是否填满：");
					float length = sc.nextFloat();
					float width = sc.nextFloat();
					String color = sc.next();
					boolean filled = sc.nextBoolean();
					Geometric rectangle = new Rectangle(length, width, color ,filled);
					System.out.println(rectangle.toString());
					break;
				}
				case 3 : {
					return;
				}
			}
		}
	}

}
