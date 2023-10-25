import java.util.Scanner;

class MyArrayList {
    private int size = 0;
    private final int CAPACITY = 100;
    private String[] data;

    public MyArrayList () {// ��ʼ�����Ա�
        data = new String[CAPACITY];
    }

    public MyArrayList (String[] data) {
        super();// �̳��˸���
        this.data = data;
    } 

    public void Insert(int index,String s) { //��ĳһλ�ò���
        for(int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = s;
        size++;
    }
     
    public void Insert(String s) { //��ĩβ����
        Insert(size,s);
    }

    public void showAll() {//�������ӡ����Ԫ��
        System.out.print("[");
        for(int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if(i < size-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void deleteList(int index) {//ɾ�����Ա���ĳ���±�Ԫ��
        for(int i = index-1; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
        System.out.println("��ɾ��");
    }
    
    public int size() {//���Ա�Ĵ�С
        return size;
    }
    
    public boolean isEmpty() {//�ж����Ա��Ƿ�Ϊ��
        return size == 0;
    }

    public void clear() {//������Ա�
        size = 0;

    }
    
    public void takeplaceElem(int index, String s) {//�滻���Ա���ĳ���±��е�Ԫ��
        data[index-1] = s;
    }
 
    public String gainElem(int index) {//�õ����Ա��е�ĳ��Ԫ��
        return data[index-1];
    }
 
    public boolean Contain(String s) {//�ж����Ա����Ƿ����ĳ��Ԫ��
        for(int i = 0; i < size; i++) {
            if(data[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
     
    public int indexOf(String s) {//����ĳ��Ԫ�ص��±꣨����
        for(int i = 0; i <= size; i++) {
            if (data[i].equals(s)) {
                return i+1;
            }
        }
        return -1;
    }
      
    public int lastIndexOf(String s) {//����ĳ��Ԫ�ص��±꣨����
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
             System.out.println("*********������������еĲ���*********");
             System.out.println("*********1.��ʼ�����Ա�***************");
             System.out.println("*********2.����Ԫ�ص����Ա�************");
             System.out.println("*********3.���������������Ա�*********");
             System.out.println("*********4.ɾ�����Ա��е�Ԫ��*********");
             System.out.println("*********5.��ʾ���Ա�Ĵ�С***********");
             System.out.println("*********6.�ж����Ա��Ƿ�Ϊ��*********");
             System.out.println("*********7.�滻���Ա��е�Ԫ��*********");
             System.out.println("*********8.�������Ա��е�Ԫ��*********");
             System.out.println("*********9.�ж����Ա��а�����Ԫ��*****");
             System.out.println("*********10.����������Ա��е�Ԫ��******");
             System.out.println("*********11.����������Ա��е�Ԫ��*****");
             System.out.println("*********12.������Ա�������Ԫ��*********");
             System.out.println("*********13.�˳�������*****************");
             System.out.println("*************************************");
             int choose = sc1.nextInt();
             switch (choose) {
                 case 1 -> {
                     System.out.println("����������Ҫ�������Ա�Ĵ�С��");
                                    int size = sc1.nextInt();
                     for(int i = 1; i <= size ; i++ ) {
                         System.out.println("�������" + i + "��Ԫ��");
                         String elem = sc1.next();
                         list.Insert(elem);
                     }
                 }
                 case 2 -> {
                     System.out.println("��������Ҫ�����λ�ã�");
                     int location = sc1.nextInt();
                     System.out.println("��������Ҫ�����Ԫ�أ�");
                     String elem = sc1.next();
                                    list.Insert(location,elem);
                 }
                 case 3 -> {
                     list.showAll();
                 }
                 case 4 -> {
                     System.out.println("��������Ҫɾ�����Ա��еڼ���Ԫ�أ�");
                     int index = sc1.nextInt();
                     list.deleteList(index);
                 }
                 case 5 -> {
                     System.out.println("�����Ա�Ĵ�С�ǣ�" + list.size());
                 }
                 case 6 -> {
                     System.out.println(list.isEmpty());
                 }
                 case 7 -> {
                     System.out.println("��������Ҫ�滻Ԫ�ص�λ�ã�");
                     int location = sc1.nextInt();
                     System.out.println("��������Ҫ�滻��Ԫ�أ�");
                     String elem = sc1.next();
                     list.takeplaceElem(location,elem);                     
                 }
                 case 8 -> {
                     System.out.println("��������Ҫ���ҵ�λ�ã�");
                                    int index = sc1.nextInt();
                     System.out.println(list.gainElem(index));
                 }
                 case 9 -> {
                     System.out.println("������һ��Ԫ�أ�");
                     String elem = sc1.next();
                     System.out.println(list.Contain(elem));
                 }
                 case 10 -> {
                     System.out.println("������һ��Ԫ�أ�");
                     String elem = sc1.next();
                     System.out.println("���Ԫ�ص�λ���ǣ�" + list.indexOf(elem));
                 }
                 case 11 -> {
                     System.out.println("������һ��Ԫ�أ�");
                     String elem = sc1.next();
                     System.out.println("���Ԫ�ص�λ���ǣ�" + list.lastIndexOf(elem));
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
