//�����û������10����ֵ���Լ�д�����㷨�����������в���������Ľ��
//�������У�����ʹ��ð���������

import java.util.Scanner;

class methodSort {
    int[] arr;
    public void bubbleSort(int[] arr) {
        boolean flag = true;// ��һ����־flag����������Ϊtrue
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
               if(arr[j] > arr[j + 1]) {
                   flag = false; //�����������жϽ���ѭ���򽫱�־�ﶨ��Ϊflase ��������if����
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
            }
            if(flag) {//��û�н���if�����Ľ������룬��ֱ�Ӱ���ԭ����true����break
                break;
            }
        }
    }
}
public class TestBubbleSort {
    public static void main(String[] args) {
        methodSort method = new methodSort();
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        System.out.println("���û�����10������");
        for(int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }
        method.bubbleSort(ints);
        for(int anInt:ints) {
            System.out.println(anInt + " ");
        }
    }
}
