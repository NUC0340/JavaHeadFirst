//根据用户输入的10个数值，自己写排序算法进行升序排列并输出排序后的结果
//升序排列，这里使用冒泡排序进行

import java.util.Scanner;

class methodSort {
    int[] arr;
    public void bubbleSort(int[] arr) {
        boolean flag = true;// 做一个标志flag并把它定义为true
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
               if(arr[j] > arr[j + 1]) {
                   flag = false; //若经过上述判断进入循环则将标志物定义为flase 继续进行if条件
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
            }
            if(flag) {//若没有进行if条件的交换参与，则直接按照原来的true进行break
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
        System.out.println("请用户输入10个数：");
        for(int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }
        method.bubbleSort(ints);
        for(int anInt:ints) {
            System.out.println(anInt + " ");
        }
    }
}
