//��ʵ���Ǵ�������ѧ���ʴ𣬽�˵�Ļ���Ϊһ���������ŵ�һ�����У��������������˵�Ļ�
class Student {
    String name;
    public void Speak(String sentence) {
        System.out.println(name + "˵:" + sentence);
    }
}
public class HelloWorld3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "�ź��";
        stu2.name = "������";
              stu1.Speak("��ϲ��ѧϰJava��");
              stu2.Speak("ϲ��ѽ��ϲ���Ĳ����˰���");
    }
   
}