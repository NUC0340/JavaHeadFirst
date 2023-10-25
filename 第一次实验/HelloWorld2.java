class Student {
    //成员变量
       //成员方法
      String name;
      public void Speak(){
        System.out.println(name + "说：HelloWorld！") ;
    }
}
public class HelloWorld2 {
    public static void main(String[] args) {
    Student stu = new Student();
    stu.name = "张恒瑜";
       stu.Speak();
    }
}
