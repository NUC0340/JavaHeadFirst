//ˮ�ɻ��ǣ�abc = a^3 + b^3 + c^3
//ˮ�ɻ��� Daffodil

import java.util.Scanner;

class Daffodil {
    int number;
    public void JudgeDaffodilNum () {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����λ����");
        number = sc.nextInt();
        if(number == Math.pow(number%10 , 3) + Math.pow((number%100)/10 , 3) + Math.pow(number/100 , 3)) {
            System.out.println("����һ��ˮ�ɻ�����");
        }
        else {
                 System.out.println("��Ǹ���ⲻ��һ��ˮ�ɻ�����");
             }
         }
   }
public class TestDaffodil {
    public static void main (String[] args) {
        
        Daffodil da = new Daffodil();
        da.JudgeDaffodilNum();
        
    }
}
