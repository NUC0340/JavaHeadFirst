import java.util.Scanner;

class Box {
    public float getVolume(float size) {
        return size*size*size;
    }
    public float getVolume(float height,float width,float length) {
        return height*width*length;
    }
}

public class TestBoxVolume {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();
        while (true) {
            System.out.println("*************************************");
            System.out.println("***********��ѡ����Ҫ���еļ���*******");
            System.out.println("*************1.����������� **********");
                     System.out.println("*************2.����������� **********");
                     System.out.println("*************3.�˳������� ************");
            System.out.println("*************************************");
                     int num = sc.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("������������ı߳�:");
                    float size = sc.nextFloat();
                    System.out.println("�����������ǣ�" +  box.getVolume(size));
                }
                case 2 -> {
                    System.out.println("�����볤����ĳ���");
                    float height = sc.nextFloat();
                    System.out.println("�����볤����Ŀ�");
                    float width = sc.nextFloat();
                    System.out.println("�����볤����ĸߣ�");
                    float length = sc.nextFloat();
                    System.out.println("�����������ǣ�" +  box.getVolume(height,width,length));
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}