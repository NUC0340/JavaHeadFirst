//闰年（leapyear）判断：year % 4 == 0 && year % 100 ！= 0

import java.util.Scanner;

class Leapyear {
    int year;
    public void JudgeLeapyear () {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("是的朋友，这是一个闰年！");
        }
        else {
            System.out.println("oh抱歉我的上帝，这不是一个闰年！");
         }
    }
}
public class TestLeapyear {
    public static void main (String[] args) {
        Leapyear yea = new Leapyear();
        yea.JudgeLeapyear();
    }
}