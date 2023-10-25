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
            System.out.println("***********请选择你要进行的计算*******");
            System.out.println("*************1.正方体的运算 **********");
                     System.out.println("*************2.长方体的运算 **********");
                     System.out.println("*************3.退出主程序 ************");
            System.out.println("*************************************");
                     int num = sc.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("请输入正方体的边长:");
                    float size = sc.nextFloat();
                    System.out.println("正方体的体积是：" +  box.getVolume(size));
                }
                case 2 -> {
                    System.out.println("请输入长方体的长：");
                    float height = sc.nextFloat();
                    System.out.println("请输入长方体的宽：");
                    float width = sc.nextFloat();
                    System.out.println("请输入长方体的高：");
                    float length = sc.nextFloat();
                    System.out.println("长方体的体积是：" +  box.getVolume(height,width,length));
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}