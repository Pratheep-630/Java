import java.util.*;
public class MultiThreading{
    static class Account{
        private int balance;
        public int get(){
            return balance;
        }
        public void increment(){
            balance++;
        }
    }
    public static void main(String[] args) {
        Account acc=new Account();
        Thread t1=new Thread(()->{      


            8
            try {
                System.out.println("acc bal from thr 1:"+acc.get());
                acc.increment();
                Thread.sleep(1000);
                acc.increment();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
       Thread t2=new Thread(()->{
            try {
                System.out.println("acc bal from thr 2:"+acc.get());
                acc.increment();
                Thread.sleep(1000);
                acc.increment();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
            t1.start();
            t2.start();
            System.out.println("out side threads-acc balance is:"+acc.get());
    }
}
