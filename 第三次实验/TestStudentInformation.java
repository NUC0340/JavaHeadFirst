//������String�����Ա�char���������ɼ���float�����ߴ��ɼ���float����C���Գɼ���float�����������ɼ���float����
//¼�� ��ȡ ��ƽ����

import java.util.Scanner;

class Information {
    String name;
    String gender;
    String[] course = {"�ߵ���ѧ", "���Դ���" , "C����" , "�������" };
    float[] score = {};
    public void initInformation() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ѧ����������");
              name = sc.next();
        System.out.println("�������ѧ�����Ա�");
              gender = sc.next();
              score = new float[course.length];
        for(int i = 0 ; i < course.length; i++){
                System.out.println(course[i]);
                score[i] = sc.nextFloat();
            }  
    }
    public void ShowInformation() {
        System.out.println("��ѧ���������ǣ�" + name);
        System.out.println("��ѧ�����Ա��ǣ�" + gender);
        for(int i = 0; i < course.length; i++) {
        System.out.println("��ѧ����" + course[i] + "�ĳɼ��ǣ�" + score[i]);
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
            System.out.println("******��ѡ������Ҫ���еĲ���******");
            System.out.println("******1.������ѧ���Ļ�����Ϣ******");
            System.out.println("******2.չʾѧ���Ļ�����Ϣ********");
            System.out.println("******3.�����ѧ����ƽ���ɼ�******");
            System.out.println("******4.�˳�������****************");
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
                    System.out.println("��ѧ����ƽ���ɼ��ǣ�" + infor.Average());
                    break;
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

}

