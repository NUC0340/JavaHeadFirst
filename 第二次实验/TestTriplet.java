
import java.util.Scanner;

class Triplet {
    float e1;
    float e2;
    float e3;
    public void initTriplet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三元组的三个数:");
        e1 = sc.nextFloat();
        e2 = sc.nextFloat();
        e3 = sc.nextFloat();
        
     }
    public void SearchTriplet() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入查找的三元组中的第几个数：");
        int num = sc1.nextInt();
        if(num == 1) System.out.println(e1);
        if(num == 2) System.out.println(e2);
        if(num == 3) System.out.println(e3);
    }
    public void ChangeTriplet() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("你要修改三元组中第几个数：");
        int num = sc2.nextInt();
        if(num == 1){
            e1 = sc2.nextFloat();
            System.out.println("修改后的数为：" + e1);
        }
        if(num == 2){
            e2 = sc2.nextFloat();
            System.out.println("修改后的数为：" + e2);
        }
        if(num == 3){
            e3 = sc2.nextFloat();
            System.out.println("修改后的数为：" + e3);
        }
    }
    public float MaxTriplet() {
        float max = e1;
        if(e2 > e1) {
            max = e2;
        }
        if(e3 > e2) {
            max = e3;
        }
        return max;
    }
    public float MinTriplet() {
        float min = e1;
        if(e2 < e1) min = e2;
        if(e3 < e2) min = e3;
        return min;
        }
     public void ShowTriplet() {
         System.out.println("当前三元组是:" + "[" + e1 + "," + e2  + "," + e3 +c "]") ;
     }
     public void DeleteTriplet() {
     }
}

public class TestTriplet {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        Triplet tri = new Triplet();
        int choose;
        while (true) {
        System.out.println("******请输入你想进行的操作******");
              System.out.println("********1.创建一个三元组********");
              System.out.println("********2.查找三元组的数********");
              System.out.println("********3.修改三元组的数********");
              System.out.println("********4.找三元组最大值********");
              System.out.println("********5.找三元组最小值********");
              System.out.println("********6.列目前的三元组********");
              System.out.println("********7.删除目前三元组********");
        System.out.println("***********8.退出程序***********");
        System.out.println("*******请输入你想进行的操作*******");
        choose = sc3.nextInt();
        
        switch (choose) {
            case 1 -> {
            tri.initTriplet();
            break;
            }
            case 2 -> {
            tri.SearchTriplet();
            break;
            }
            case 3 -> {
            tri.ChangeTriplet();
            break;
            }
            case 4 -> {
            tri.MaxTriplet();
            System.out.println("三元组的最大值是：" + tri.MaxTriplet());
            break;
            }
            case 5 -> {
            tri.MinTriplet();
            System.out.println("三元组的最小值是：" + tri.MinTriplet());
            break;
            }
            case 6 -> {
            tri.ShowTriplet();
            break;
            }
            case 7 -> {
            tri.DeleteTriplet();
            break;
            }
            case 8 -> {
            return;
            }
            default -> {
            System.out.println("输入错误请重新输入！");
            break;
            }
        }
    }
  }
}









