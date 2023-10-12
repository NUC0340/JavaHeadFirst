package nuc_zhy0340_shopping;

import java.util.Scanner;

import nuc_zhy0340_shopping_db.ClothDateSet;

import nuc_zhy0340_shopping_entity.*;

public class TestClothDateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClothDateSet clothDateSet = new ClothDateSet();
		Cloth[] clothes = clothDateSet.getCloth();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("****************************");
			System.out.println("******请输入你想进行的操作******");
			System.out.println("*****1.陈列当前衣服的数据*******");
			System.out.println("*****2.根据名字查找衣服********");
			System.out.println("*****3.根据尺寸查找衣服********");
			System.out.println("*****4.根据价格查找衣服********");
			System.out.println("*****5.根据编号查找衣服*******");
			System.out.println("*****6.增加当前的库中数据*******");
			System.out.println("*****7.更改当前的库中数据*******");
			System.out.println("*****8.退出主程序*************");
			System.out.println("****************************");
			int choose = sc.nextInt();
			switch (choose) {
				case 1 : {
					for (int i = 0; i < clothes.length; i++) {
						Cloth clo = clothes[i];
						if(clothes[i] != null) {
							System.out.println(clo);
						}
					}
					break;
				}
				case 2 : {
					System.out.println("请输入你想要查找的衣服:");
					String cloName = sc.next();
					Cloth c = clothDateSet.queryByName(cloName);
					if(c != null) {
						System.out.println(clothDateSet.queryByName(cloName));
					}else System.out.println("很抱歉，没有这件衣服");
			 		break;
				}
				case 3 : {
					System.out.println("请输入你想要查找的尺寸:");
					String cloSize = sc.next();
					Cloth c = clothDateSet.queryBySize(cloSize);
					if(c != null) {
						System.out.println(clothDateSet.queryBySize(cloSize));
					}else System.out.println("很抱歉，没有这种尺寸的衣服");
			 		break;
				}
				case 4 : {
					System.out.println("请输入你想要查找的价格:");
					int cloPrice = sc.nextInt();
					Cloth c = clothDateSet.queryByPrice(cloPrice);
					if(c != null) {
						System.out.println(clothDateSet.queryByPrice(cloPrice));
					}else System.out.println("很抱歉，没有属于这个价格的衣服");
			 		break;
				}
				case 5 : {
					System.out.println("请输入你想要查找的编号:");
					int cloCid = sc.nextInt();
					Cloth c = clothDateSet.queryByCid(cloCid);
					if(c != null) {
						System.out.println(clothDateSet.queryByCid(cloCid));
					}else System.out.println("很抱歉，没有衣服属于这个编码");
			 		break;
				}
				case 6 : {
					clothDateSet.addCloth();
					break;
				}
				case 7 : {
					clothDateSet.changeCloth();
					break;
				}
				case 8 : {
					return;
				}
				} 
			}
	}
}
