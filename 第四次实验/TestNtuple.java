//���ʵ�ֳ����������͡�NԪ�� ��Tuple���� ��ÿ��NԪ��������N��ʵ�������й��ɣ�������������������һ��NԪ�飬ȡNԪ�������һ����������NԪ�������һ����������NԪ�������������С��������ʾNԪ��ȡ�

import java.util.Scanner;

class NTuple {
    float[] elem;
    public void Initntuple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������봴��nԪ���Ԫ�ظ�����");
        int num = sc.nextInt();
        elem = new float[num];
        for(int i = 0; i < elem.length; i++) {
            int j = i + 1;
	    System.out.println("�������" + j + "������");
            elem[i] = sc.nextFloat();
	    System.out.println(" ");
        }
    }
    public void SearchElem() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("��������Ҫ�������ڵڼ������� ");
        int num = sc1.nextInt();
        System.out.println(elem[num - 1]);
    }
    public void ChangeElem() {
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("��������Ҫ�ı������ڵڼ�������");
        int num = sc2.nextInt();
        System.out.println("�������Ҫ�ı�Ϊ��");
        elem[num - 1] = sc2.nextFloat();
        System.out.println("�����ڵ�" + num +  "�����Ѿ���Ϊ" + elem[num - 1]);
    }
    public float Maxntuple() {
        float max = elem[0];
        int maxindex = 0;//�����������Ҳ���ǲ��У����Ǵ�����������ĳ�����뵽��ѡ�����򣬶�����ֻ�õ���ѡ�������һ���֣�Ҳ������Ҫ��һ���֣��������������±���в���
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
                minindex = i + 1;//��������ɴ���ê�㣬����Сֵ����һ����Ȼ��ֱ�Ӵ��ͣ�
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
            System.out.println("******������������еĲ���******");
              System.out.println("********1.����һ��NԪ��********");
              System.out.println("********2.����NԪ�����********");
              System.out.println("********3.�޸�NԪ�����********");
              System.out.println("********4.��NԪ�����ֵ********");
              System.out.println("********5.��NԪ����Сֵ********");
              System.out.println("********6.��Ŀǰ��NԪ��********");
              System.out.println("***********7.�˳�����***********");
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
                      System.out.println("NԪ�����������ǣ�" + tuple.Maxntuple());
                      break;
                  }
                  case 5 -> {
                      System.out.println("NԪ������С�����ǣ�" + tuple.Minntuple());
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
                  System.out.println("����������������룡");
                  break;

              }
        }    
     }
   }
}
