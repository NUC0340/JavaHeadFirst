
import java.util.Scanner;

class Triplet {
    float e1;
    float e2;
    float e3;
    public void initTriplet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ԫ���������:");
        e1 = sc.nextFloat();
        e2 = sc.nextFloat();
        e3 = sc.nextFloat();
        
     }
    public void SearchTriplet() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("��������ҵ���Ԫ���еĵڼ�������");
        int num = sc1.nextInt();
        if(num == 1) System.out.println(e1);
        if(num == 2) System.out.println(e2);
        if(num == 3) System.out.println(e3);
    }
    public void ChangeTriplet() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("��Ҫ�޸���Ԫ���еڼ�������");
        int num = sc2.nextInt();
        if(num == 1){
            e1 = sc2.nextFloat();
            System.out.println("�޸ĺ����Ϊ��" + e1);
        }
        if(num == 2){
            e2 = sc2.nextFloat();
            System.out.println("�޸ĺ����Ϊ��" + e2);
        }
        if(num == 3){
            e3 = sc2.nextFloat();
            System.out.println("�޸ĺ����Ϊ��" + e3);
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
         System.out.println("��ǰ��Ԫ����:" + "[" + e1 + "," + e2  + "," + e3 +c "]") ;
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
        System.out.println("******������������еĲ���******");
              System.out.println("********1.����һ����Ԫ��********");
              System.out.println("********2.������Ԫ�����********");
              System.out.println("********3.�޸���Ԫ�����********");
              System.out.println("********4.����Ԫ�����ֵ********");
              System.out.println("********5.����Ԫ����Сֵ********");
              System.out.println("********6.��Ŀǰ����Ԫ��********");
              System.out.println("********7.ɾ��Ŀǰ��Ԫ��********");
        System.out.println("***********8.�˳�����***********");
        System.out.println("*******������������еĲ���*******");
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
            System.out.println("��Ԫ������ֵ�ǣ�" + tri.MaxTriplet());
            break;
            }
            case 5 -> {
            tri.MinTriplet();
            System.out.println("��Ԫ�����Сֵ�ǣ�" + tri.MinTriplet());
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
            System.out.println("����������������룡");
            break;
            }
        }
    }
  }
}









