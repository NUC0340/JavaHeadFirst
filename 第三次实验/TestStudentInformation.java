//姓名（String）、性别（char）、高数成绩（float）、线代成绩（float）、C语言成绩（float）、面向对象成绩（float）；
//录入 调取 求平均分

import java.util.Scanner;

class Information {
    String name;
    String gender;
    String[] course = {"高等数学", "线性代数" , "C语言" , "面向对象" };
    float[] score = {};
    public void initInformation() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入该学生的姓名：");
              name = sc.next();
        System.out.println("请输入该学生的性别：");
              gender = sc.next();
              score = new float[course.length];
        for(int i = 0 ; i < course.length; i++){
                System.out.println(course[i]);
                score[i] = sc.nextFloat();
            }  
    }
    public void ShowInformation() {
        System.out.println("该学生的姓名是：" + name);
        System.out.println("该学生的性别是：" + gender);
        for(int i = 0; i < course.length; i++) {
        System.out.println("该学生的" + course[i] + "的成绩是：" + score[i]);
        }
    }
    public float Average() {
        float sum = 0;
        float average;
        for(int i = 0; i < course.length; i++) {
            sum = sum + score[i];
        }
        average = sum / course.length;
        return average;
    }      
}
public class TestStudentInformation {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Information infor = new Information();
        while (true) {
            System.out.println("******请选择你想要进行的操作******");
            System.out.println("******1.请输入学生的基本信息******");
            System.out.println("******2.展示学生的基本信息********");
            System.out.println("******3.求出该学生的平均成绩******");
            System.out.println("******4.退出主程序****************");
            int num = sc1.nextInt();
        switch (num) {
                case 1 -> {
                    infor.initInformation();
                    break;
                }
                case 2 -> {
                    infor.ShowInformation();
                    break;
                }
                case 3 -> {
                    infor.Average();
                    System.out.println("该学生的平均成绩是：" + infor.Average());
                    break;
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

}

