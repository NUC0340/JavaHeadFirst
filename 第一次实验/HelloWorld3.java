//其实就是创建两个学生问答，将说的话设为一个参数，放到一个类中，可以随意更改想说的话
class Student {
    String name;
    public void Speak(String sentence) {
        System.out.println(name + "说:" + sentence);
    }
}
public class HelloWorld3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "张恒瑜";
        stu2.name = "无名氏";
              stu1.Speak("你喜欢学习Java吗？");
              stu2.Speak("喜欢呀，喜欢的不得了啊！");
    }
   
}