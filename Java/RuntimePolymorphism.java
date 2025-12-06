public class RuntimePolymorphism{
    public static void main(String []args){
        Person e=new Employee ("54656",5660.5f,"pradeep",20,40.1f);
        e.printPerson();
        Person p=new Employee("5465",3544.3f,"rockz",50,55.2f);
        p.printPerson();
        
        
    }
}

class Person{
    String name;
    int age;
    float weight;
    Person(String name,int age,float weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void printPerson(){
        System.out.println("age is:"+age);
        System.out.println("name is :"+name);
        System.out.println("weight is :"+weight);
    }
}

    class Employee extends Person{
        String emID;
        float salary;
        Employee(String emID,float salary,String name,int age,float weight){
            super(name,age,weight);
            this.emID=emID;
            this.salary=salary;
        }
        public void printPerson(){
            System.out.println("name is " + super.name);
            System.out.println("age is " + super.age);
            System.out.println("weight is " + super.weight);
            System.out.println("empID is " +emID);
            System.out.println("salary is " + salary);
        }
}