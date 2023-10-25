package nuc_zhy0340_list_abstract;

import java.util.Scanner;

public class TestAbstractList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList list = new MyArrayList();
	         while(true) {
	             System.out.println("*************************************");
	             System.out.println("*********请输入你想进行的操作*********");
	             System.out.println("*********1.初始化线性表***************");
	             System.out.println("*********2.插入元素到线性表************");
	             System.out.println("*********3.陈列所创建的线性表*********");
	             System.out.println("*********4.删除线性表中的元素*********");
	             System.out.println("*********5.显示线性表的大小***********");
	             System.out.println("*********6.判断线性表是否为空*********");
	             System.out.println("*********7.替换线性表中的元素*********");
	             System.out.println("*********8.清除线性表中所有元素*********");
	             System.out.println("*********9.退出主程序*****************");
	             System.out.println("*************************************");
	             Scanner sc = new Scanner(System.in);
	             int choice = sc.nextInt();
	             switch (choice) {
	              	case 1:                     
	              		System.out.println("请输入你想要创建线性表的大小：");
	              		int size = sc.nextInt();
                    	for(int i = 1; i <= size ; i++ ) {
                    	System.out.println("请输入第" + i + "个元素");
                    	String elem = sc.next();
                    	list.insertElem(elem);
                    	}
                    	break;
	              	case 2:
	                    System.out.println("请输入你要插入的位置：");
	                    int location = sc.nextInt();
	                    System.out.println("请输入你要插入的元素：");
	                    String elem = sc.next();
	                    list.insertElem(location,elem);
	                    break;
	              	case 3:
	              		System.out.println(list.toString());
	              		break;
	              	case 4:
	              		System.out.println("请输入你要删除元素的位置：");
	              		int localtion1 = sc.nextInt();
	              		System.out.println("该元素是否被删除" + list.remove(localtion1));
	              		break;
	              	case 5:
	              		System.out.println(list.getLength());
	              		break;
	              	case 6:
	              		System.out.println(list.isEmpty());
	              		break;
	              	case 7:
	                    System.out.println("请输入你要替换元素的位置：");
	                    int location2 = sc.nextInt();
	                    System.out.println("请输入你要替换的元素：");
	                    Object e = sc.next();
	                    list.change(location2,e);  
	                    break;
	              	case 8:
	              		list.clear();
	              		break;
	              	case 9:
	              		 return;
	             }
	            	 
	         }
		}
	}

