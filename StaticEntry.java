public class StaticEntry{
    public static void main (String[]args){
        Person p1=new Person("pradeeprockz",24);
        Person p2=new Person("pspk",52);
        System.out.println("p1:"+p1);
         System.out.println("p1.name:"+p1.name+p1.age);
         System.out.println("p2:"+p2);
          System.out.println("p2.name:"+p2.name+p2.age);

          // p1.no0fEyes=100;
          //System.out.println("No of eyes:"+p1.no0fEyes);
          p1.no0fEyes=500;
          System.out.println("p1.No of eyes"+p1.no0fEyes);
          System.out.println("p2.No0fEyes:"+p2.no0fEyes);
    }

 }


class Person{
    String name;
    int age;
    //class attribute
   static int no0fEyes;
   //constructer
   Person(String name,int age){
     this.name=name;
     this.age=age;
   }
}