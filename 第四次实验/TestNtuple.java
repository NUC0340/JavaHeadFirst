//设计实现抽象数据类型“N元组 （Tuple）” 。每个N元组由任意N个实数的序列构成，基本操作包括：创建一个N元组，取N元组的任意一个分量，置N元组的任意一个分量，求N元组的最大分量、最小分量，显示N元组等。

import java.util.Scanner;

class NTuple {
    float[] elem;
    public void Initntuple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想创建n元组的元素个数：");
        int num = sc.nextInt();
        elem = new float[num];
        for(int i = 0; i < elem.length; i++) {
            int j = i + 1;
	    System.out.println("请输入第" + j + "个数：");
            elem[i] = sc.nextFloat();
	    System.out.println(" ");
        }
    }
    public void SearchElem() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你要查数组内第几个数： ");
        int num = sc1.nextInt();
        System.out.println(elem[num - 1]);
    }
    public void ChangeElem() {
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("请输入你要改变数组内第几个数：");
        int num = sc2.nextInt();
        System.out.println("这个数你要改变为：");
        elem[num - 1] = sc2.nextFloat();
        System.out.println("数组内第" + num +  "个数已经改为" + elem[num - 1]);
    }
    public float Maxntuple() {
        float max = elem[0];
        int maxindex = 0;//用排序后再找也不是不行，但是聪明绝顶的张某立马想到了选择排序，而这里只用到了选择排序的一部分，也是最重要的一部分，就是利用数组下标进行查找
        for(int i = 0; i < elem.length - 1; i++) {
            if(elem[i] < elem[i + 1]) {
                maxindex = i + 1;
            }
        }
        max = elem[maxindex];
        return max;
    }
    public float Minntuple() {
        float min = elem[0];
        int minindex = 0;
        for(int i = 0; i < elem.length - 1; i++) {
            if(elem[i] > elem[i + 1]) {
                minindex = i + 1;//可以想象成传送锚点，在最小值设置一个，然后直接传送！
            }
        }
        min = elem[minindex];
        return min;
   } 
    public void Showntuple() {
        for(float anFloat:elem) { 
        System.out.println("[" + anFloat + "]");
        }
    }
}

public class TestNtuple {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        NTuple tuple = new NTuple();
        while(true) {
            System.out.println("******请输入你想进行的操作******");
              System.out.println("********1.创建一个N元组********");
              System.out.println("********2.查找N元组的数********");
              System.out.println("********3.修改N元组的数********");
              System.out.println("********4.找N元组最大值********");
              System.out.println("********5.找N元组最小值********");
              System.out.println("********6.列目前的N元组********");
              System.out.println("***********7.退出程序***********");
              int choose = sc3.nextInt();
              switch(choose) {
                  case 1 -> {
                      tuple.Initntuple();
                      break;
                  }
                  case 2 -> {
                      tuple.SearchElem();
                      break;
                  }
                  case 3 -> {
                      tuple.ChangeElem();
                      break;
                  }
                  case 4 -> {
                      System.out.println("N元组中最大的数是：" + tuple.Maxntuple());
                      break;
                  }
                  case 5 -> {
                      System.out.println("N元组中最小的数是：" + tuple.Minntuple());
                      break;
                  }
                  case 6 -> {
                      tuple.Showntuple();
                      break;
                  }
                  case 7 -> {
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
