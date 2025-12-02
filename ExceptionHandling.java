import java.util.ArrayList;
import java.util.Arrays;
public class ExceptionHandling{
    public static void main(String []args){
        try {
         System.out.println(10/0); 
           ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4));
           System.out.println(numbers.get(10000));
        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of bound exception:"+e);
        } catch (Exception e){
            System.out.println("Exception is:"+e);
        }finally{
            System.out.println("finally block is excuted.");
        }
        //System.out.println(19/0);
        System.out.println("After exception handling..");
    }
}
