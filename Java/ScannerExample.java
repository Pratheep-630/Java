import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Scanner sc1=new Scanner(System.in);
          Scanner sc3=new Scanner(System.in);
        int num;
    System.out.println("enter a number..");
num=sc.nextInt();
System.out.println("entered num is:"+num);
//String input
System.out.println("enter name:");
String name;
name=sc1.nextLine();
System.out.println("user name is:"+name);
//char
System.out.println("enter name:");
char ch;
ch=sc3.next().charAt(0);
System.out.println("entered char is:"+ch);



sc.close();
    }
    
}