package nuc.sw.shopping.dao;

import nuc_zhy0340_shopping_entity.Book;
import nuc_zhy0340_shopping_entity.Category;
import nuc.sw.shopping.db.*;


import java.util.Scanner;
public class BookDaoImpl implements IBookDao{
    private int index = 0;
    private int datasize = 0;
    final int DateBaseSize = 100;
    private Book[] books = new Book[DateBaseSize];
	final Category category1 = new Category(1, "计算机", "java");
	final Category category2 = new Category(2, "小说", "名著");
    
    Scanner sc = new Scanner(System.in);
	public void insertBook() {
		System.out.println("你要添加几本书？");
		int amount= sc.nextInt();
		datasize = amount;
		for(int i = 0; i < datasize; i++) {
			System.out.println("请输入书本的名字:");
			String name = sc.next();
			System.out.println("请输入书本的作者:");
			String author = sc.next();
			System.out.println("请输入书本的价格:");
			float price = sc.nextFloat();
			System.out.println("请输入书本的数量:");
			int num = sc.nextInt();
			Category selectCate = null;
            System.out.println(1 + " 计算机 " + "Java");
           	System.out.println(2 + " 小说 " + "名著");
           	System.out.println("你想添加1或2哪个种类的书籍？");
           	int select = sc.nextInt();
           	switch (select) {
           		case 1 : {
           			selectCate = category1;
           			System.out.println("书籍添加成功!");
           			break;
           		} 
           		case 2 : {
           			selectCate = category2;
           			System.out.println("书籍添加成功!");
           			break;
           		}
           	}
            books[index] = new Book(index, name, author, price, num, selectCate);
           	index++;
		}   
	}

	public Book[] quertBooks() {
		return books;
	}
	

	
	public Book queryBookById(int bid) {
		Book book = null;
		for(int i = 0; i < datasize; i++) {
			if(books[i].getBid() == bid) {
				return books[i];
			}
		}
		return null;
	}

	public Book queryBookByName(String name) {
		Book book = null;
		for(int i = 0; i < datasize; i++) {
			if(books[i].getName().equals(name)) {
				return books[i];
			}
		}
		return null;
	}

	public Book queryBookByAuthor(String author) {
		Book book = null;
		for(int i = 0; i < datasize; i++) {
			if(books[i].getAuthor().equals(author)) {
				return books[i];
			}
		}
		return null;
	}

	public Book queryBookByPrice(int price) {
		Book book = null;
		for(int i = 0; i < datasize; i++) {
			if(books[i].getPrice() == price) {
				return books[i];
			}
		}
		return null;
	}

	public void modifyBook() {
		System.out.println("请输入你要修改图书的编号：");
		int ser = sc.nextInt();
		System.out.println("该图书的数据是：" + books[ser]);
		while (true) {
			System.out.println("1.名字");
			System.out.println("2.作者");
			System.out.println("3.价格");
			System.out.println("4.数量");
			System.out.println("5.退出");
			System.out.println("请选择你要修改的数据：");
			int choice = sc.nextInt();
			switch (choice) {
				case 1 : {
					System.out.println("你要将名字修改成什么？");
					String name = sc.next();
					books[ser].setName(name);
					System.out.println("修改完成");
					break;
				} 
				case 2 : {
					System.out.println("你要将作者修改成什么？");
					String size = sc.next();
					books[ser].setAuthor(size);
					System.out.println("修改完成");
					break;
				} 
				case 3 : {
					System.out.println("你要将价格修改成什么？");
					int price = sc.nextInt();
					books[ser].setPrice(price);
					System.out.println("修改完成");
					break;
				} 
				case 4 :{
					System.out.println("你要将数量修改成什么？");
					int num = sc.nextInt();
					books[ser].setNum(num);
					System.out.println("修改完成");
					break;
					}
				case 5: 
					return;
				}

		}
	}
}
