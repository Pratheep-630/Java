public class Constructor{
    public static void main(String []args){
        Student s1=new Student();
        Student s2=new Student("pradeep",20,"24hr5a0403",9.9f);
        System.out.println("s1:"+s1);
        System.out.println("s1.name:"+s1.name);
        System.out.println("s2:"+s1);
        System.out.println("s2.name:"+s2.name+s2.age);
    }
}

class Student{
    String name;
    int age;
    String roolNumber;
    float gpa;
    public Student(){}
      public Student(String name,int age,String roolNumber,float gpa){
        this.name=name;
        this.age=age;
        this.roolNumber=roolNumber;
        this.gpa=gpa;
    }
}