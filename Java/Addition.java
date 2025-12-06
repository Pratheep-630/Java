import java.util.Scanner;
public class Addition{
    public static void main(String[]args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("first");
        int num1=scanner.nextInt();
        System.out.println("second");
        int num2=scanner.nextInt();
        int sum=num1-num2;
        System.out.println("result:.."+sum);
        scanner.close();
    }
}