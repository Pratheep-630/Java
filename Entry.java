public class Entry{
    public static void main(String[] args) {
      //p1.printInfo();  
      Student s1=new Student("PRADEEP",20,6.1f,"3-57","deguva vedhi street",517257,"nanjampeta","24hr5a0403",9.9f,"ece",'b');
      s1.printStudent();
      System.out.println();
     }
}

class Person{
    String name;
    int age;
    float height;
    Adress adress; 
    Person(String name,int age,float height,String doorNumber,String street,int pin, String city){
        this.name=name;
        this.age=age;
        this.height=height;
        Adress adress1=new Adress(doorNumber,street,pin,city);
        this.adress=adress1;

    }
    public void printInfo(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("height is:"+height);
        System.out.println("door no is:"+ adress.doorNumber);
         System.out.println("street is:"+ adress.street);
          System.out.println("pin is:"+ adress.pin);
           System.out.println("city is:"+ adress.city);
    
        
    }
}

class Adress {
    String doorNumber;
    String street;
    int pin;
    String city;


    public Adress(String doorNumber,String street,int pin,String city){
        this.doorNumber= doorNumber;
        this.street=street;
        this.pin=pin;
        this.city=city;
         
    }
}

class Student extends Person{
    String rollNumber;
    float gpa;
    String branch;
    char section;

    public Student(String name, int age, float height, String doorNumber, String street, int pin, String city,String rollNumber,float gpa,String branch,char section) {
        super(name, age, height, doorNumber, street, pin, city);
        this.rollNumber=rollNumber;
        this.gpa=gpa;
        this.branch=branch;
        this.section=section;
    }
    public void printStudent(){
        super.printInfo();
        System.out.println("rollNumber is:"+this.rollNumber);
        System.out.println("gpa is:"+this.gpa);
        System.out.println("branch is:"+this.branch);
        System.out.println("section is:"+this.section);
    }
    
}
