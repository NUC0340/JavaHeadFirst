import java.util.Scanner;

class MyArrayList {
    private int size = 0;
    private final int CAPACITY = 100;
    private String[] data;

    public MyArrayList () {// 初始化线性表
        data = new String[CAPACITY];
    }

    public MyArrayList (String[] data) {
        super();// 继承了父类
        this.data = data;
    } 

    public void Insert(int index,String s) { //在某一位置插入
        for(int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = s;
        size++;
    }
     
    public void Insert(String s) { //在末尾插入
        Insert(size,s);
    }

    public void showAll() {//遍历后打印所有元素
        System.out.print("[");
        for(int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if(i < size-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void deleteList(int index) {//删除线性表中某个下标元素
        for(int i = index-1; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
        System.out.println("已删除");
    }
    
    public int size() {//线性表的大小
        return size;
    }
    
    public boolean isEmpty() {//判断线性表是否为空
        return size == 0;
    }

    public void clear() {//清除线性表
        size = 0;

    }
    
    public void takeplaceElem(int index, String s) {//替换线性表中某个下标中的元素
        data[index-1] = s;
    }
 
    public String gainElem(int index) {//得到线性表中的某个元素
        return data[index-1];
    }
 
    public boolean Contain(String s) {//判断线性表中是否包括某个元素
        for(int i = 0; i < size; i++) {
            if(data[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
     
    public int indexOf(String s) {//查找某个元素的下标（正向）
        for(int i = 0; i <= size; i++) {
            if (data[i].equals(s)) {
                return i+1;
            }
        }
        return -1;
    }
      
    public int lastIndexOf(String s) {//查找某个元素的下标（反向）
        for (int i = size-1; i > 0; i--) {
            if(data[i].equals(s)) {
                return i+1;
            }
        }
        return -1;
    }
}

public class TestMyArrayList {
    public static void main (String[] args) {
         Scanner sc1 = new Scanner(System.in);
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
             System.out.println("*********8.给出线性表中的元素*********");
             System.out.println("*********9.判断线性表中包含的元素*****");
             System.out.println("*********10.正向查找线性表中的元素******");
             System.out.println("*********11.反向查找线性表中的元素*****");
             System.out.println("*********12.清除线性表中所有元素*********");
             System.out.println("*********13.退出主程序*****************");
             System.out.println("*************************************");
             int choose = sc1.nextInt();
             switch (choose) {
                 case 1 -> {
                     System.out.println("请输入你想要创建线性表的大小：");
                                    int size = sc1.nextInt();
                     for(int i = 1; i <= size ; i++ ) {
                         System.out.println("请输入第" + i + "个元素");
                         String elem = sc1.next();
                         list.Insert(elem);
                     }
                 }
                 case 2 -> {
                     System.out.println("请输入你要插入的位置：");
                     int location = sc1.nextInt();
                     System.out.println("请输入你要插入的元素：");
                     String elem = sc1.next();
                                    list.Insert(location,elem);
                 }
                 case 3 -> {
                     list.showAll();
                 }
                 case 4 -> {
                     System.out.println("请输入你要删除线性表中第几个元素：");
                     int index = sc1.nextInt();
                     list.deleteList(index);
                 }
                 case 5 -> {
                     System.out.println("该线性表的大小是：" + list.size());
                 }
                 case 6 -> {
                     System.out.println(list.isEmpty());
                 }
                 case 7 -> {
                     System.out.println("请输入你要替换元素的位置：");
                     int location = sc1.nextInt();
                     System.out.println("请输入你要替换的元素：");
                     String elem = sc1.next();
                     list.takeplaceElem(location,elem);                     
                 }
                 case 8 -> {
                     System.out.println("请输入你要查找的位置：");
                                    int index = sc1.nextInt();
                     System.out.println(list.gainElem(index));
                 }
                 case 9 -> {
                     System.out.println("请输入一个元素：");
                     String elem = sc1.next();
                     System.out.println(list.Contain(elem));
                 }
                 case 10 -> {
                     System.out.println("请输入一个元素：");
                     String elem = sc1.next();
                     System.out.println("这个元素的位置是：" + list.indexOf(elem));
                 }
                 case 11 -> {
                     System.out.println("请输入一个元素：");
                     String elem = sc1.next();
                     System.out.println("这个元素的位置是：" + list.lastIndexOf(elem));
                 }
                 case 12 -> {
                      list.clear();
                 }
                 case 13 -> {
                     return;
                 }
             }
             
         }
    }
}
