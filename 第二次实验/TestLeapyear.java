//���꣨leapyear���жϣ�year % 4 == 0 && year % 100 ��= 0

import java.util.Scanner;

class Leapyear {
    int year;
    public void JudgeLeapyear () {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����ݣ�");
        year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("�ǵ����ѣ�����һ�����꣡");
        }
        else {
            System.out.println("oh��Ǹ�ҵ��ϵۣ��ⲻ��һ�����꣡");
         }
    }
}
public class TestLeapyear {
    public static void main (String[] args) {
        Leapyear yea = new Leapyear();
        yea.JudgeLeapyear();
    }
}