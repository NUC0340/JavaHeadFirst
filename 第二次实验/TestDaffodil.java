//水仙花是：abc = a^3 + b^3 + c^3
//水仙花： Daffodil

import java.util.Scanner;

class Daffodil {
    int number;
    public void JudgeDaffodilNum () {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        number = sc.nextInt();
        if(number == Math.pow(number%10 , 3) + Math.pow((number%100)/10 , 3) + Math.pow(number/100 , 3)) {
            System.out.println("这是一个水仙花数！");
        }
        else {
                 System.out.println("抱歉，这不是一个水仙花数！");
             }
         }
   }
public class TestDaffodil {
    public static void main (String[] args) {
        
        Daffodil da = new Daffodil();
        da.JudgeDaffodilNum();
        
    }
}
