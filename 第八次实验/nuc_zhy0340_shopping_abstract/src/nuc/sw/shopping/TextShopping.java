package nuc.sw.shopping;

import java.util.Scanner;

import nuc.sw.shopping.dao.*;
import nuc_zhy0340_shopping_entity.*;

public class TextShopping {

	public static void main(String[] args) {
		IBookDao b = new BookDaoImpl();
		
        Book[] books = b.quertBooks();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("****************************");
			System.out.println("******请输入你想进行的操作******");
			System.out.println("*****1.陈列当前书籍的数据*******");
			System.out.println("*****2.根据名字查找书籍********");
			System.out.println("*****3.根据作者查找书籍********");
			System.out.println("*****4.根据价格查找书籍********");
			System.out.println("*****5.根据编号查找书籍*******");
			System.out.println("*****6.增加当前的库中数据*******");
			System.out.println("*****7.更改当前的库中数据*******");
			System.out.println("*****8.退出主程序*************");
			System.out.println("****************************");
			int choose = sc.nextInt();
			switch (choose) {
				case 1 : {
					for (int i = 0; i < books.length - 1; i++) {
						Book clo = books[i];
						if(books[i] != null) {
							System.out.println(clo);
						}
					}
					break;
				}
				case 2 : {
					System.out.println("请输入你想要查找的书籍:");
					String boName = sc.next();
					Book c = b.queryBookByName(boName);
					if(c != null) {
						System.out.println(b.queryBookByName(boName));
					}else System.out.println("很抱歉，没有这件书籍");
			 		break;
				}
				case 3 : {
					System.out.println("请输入你想要查找的作者的书籍:");
					String Author = sc.next();
					Book c = b.queryBookByAuthor(Author);
					if(c != null) {
						System.out.println(b.queryBookByAuthor(Author));
					}else System.out.println("很抱歉，没有这个作者所著作的书籍");
			 		break;
				}
				case 4 : {
					System.out.println("请输入你想要查找的价格:");
					int boPrice = sc.nextInt();
					Book c = b.queryBookByPrice(boPrice);
					if(c != null) {
						System.out.println(b.queryBookByPrice(boPrice));
					}else System.out.println("很抱歉，没有属于这个价格的书籍");
			 		break;
				}
				case 5 : {
					System.out.println("请输入你想要查找的编号:");
					int boBid = sc.nextInt();
					Book c = b.queryBookById(boBid);
					if(c != null) {
						System.out.println(b.queryBookById(boBid));
					}else System.out.println("很抱歉，没有书籍属于这个编码");
			 		break;
				}
				case 6 : {
					b.insertBook();
					break;
				}
				case 7 : {
					b.modifyBook();
					break;
				}
				case 8 : {
					return;
				}
				} 
			}
	}

}
