package nuc_zhy0340_shopping_db;

import java.util.Scanner;

import nuc_zhy0340_shopping_entity.*;

public class ClothDateSet {
    private Cloth[] clothes;
    private int index = 0;//标记每个数据的位置
    private int datasize =0;
	final Category category1 = new Category(1, "Sport", "Lining");
	final Category category2 = new Category(2, "Relax", "Bosie");
	final int DateBaseSize = 100; //该数据库总量大小
	
    Scanner sc = new Scanner(System.in);
 
    public ClothDateSet () {
    	clothes = new Cloth[DateBaseSize];
    }
     
    public Cloth[] getCloth() {
    	return clothes;
    }
    
    public Cloth queryByName(String name) {//根据名字来查找衣服
    	Cloth clo = null;
    	
    	for(int i = 0; i < datasize; i++) {
    		if(clothes[i].getName().equals(name)) {
    			return clothes[i];
    		}
    	}
    	return clo;
    }
    
    public Cloth queryBySize(String size) {//根据尺寸来查找衣服
    	Cloth clo = null;
    	
    	for(int i = 0; i < datasize; i++) {
    		if(clothes[i].getSize().equals(size)) {
    			return clothes[i];
    		}
    	}
    	return clo;
    }
    
    public Cloth queryByPrice(int price) {//根据价格来查找衣服
    	Cloth clo = null;
    	
    	for(int i = 0; i < datasize; i++) {
    		if(clothes[i].getPrice() == price) {
    			return clothes[i];
    		}
    	}
    	return clo;
    }
    
    public Cloth queryByCid(int cid) {//根据ID来查找衣服
    	Cloth clo = null;
    	
    	for(int i = 0; i < datasize; i++) {
    		if(clothes[i].getCid() == cid) {
    			return clothes[i];
    		}
    	}
    	return clo;
    }

    public void addCloth() {
    	System.out.println("你想添加几件衣服？");
    	int num = sc.nextInt();
    	datasize = num;
    	for(int i = 0; i < num; i++) {
    		System.out.println("请输入这件衣服的名字：");
    		String name = sc.next();
    		System.out.println("请输入这件衣服的尺寸：");
    		String size = sc.next();
    		System.out.println("请输入这件衣服的价格：");
    		int price = sc.nextInt();
    		System.out.println("请输入这件衣服的类别：");
    		// 这里输入类别使用Switch来添加
    		Category selectCate = null;
            System.out.println(1 + " Sport " + "LiNing");
           	System.out.println(2 + " Relax " + "Bosie");
           	System.out.println("你想添加1或2哪个品牌的衣服？");
           	int select = sc.nextInt();
           	switch (select) {
           		case 1 : {
           			selectCate = category1;
           			break;
           		} 
           		case 2 : {
           			selectCate = category2;
           			break;
           		}
           	}// index标记从零开始，每次在末尾添加衣服的数据
            clothes[index] = new Cloth(index, name, size, price, selectCate);
           	index++;
           }	
    	}
    
	public void changeCloth() {
		
		System.out.println("请输入你要修改衣服的编号：");
		int ser = sc.nextInt();
		System.out.println("该衣服的数据是：" + clothes[ser]);
		while (true) {
			System.out.println("1.名字");
			System.out.println("2.尺寸");
			System.out.println("3.价格");
			System.out.println("4.结束修改");
			System.out.println("请选择你要修改的数据：");
			int choice = sc.nextInt();
			switch (choice) {
				case 1 : {
					System.out.println("你要将名字修改成什么？");
					String name = sc.next();
					clothes[ser].setName(name);
					System.out.println("修改完成");
					break;
				} 
				case 2 : {
					System.out.println("你要将尺寸修改成什么？");
					String size = sc.next();
					clothes[ser].setSize(size);
					System.out.println("修改完成");
					break;
				} 
				case 3 : {
					System.out.println("你要将价格修改成什么？");
					int price = sc.nextInt();
					clothes[ser].setPrice(price);
					System.out.println("修改完成");
					break;
				} 
				case 4 :{
					return;
				}
			}
		}
		
	}
    }

