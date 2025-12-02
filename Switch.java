public class Switch {
    public static void main(String[]args){
        int day=2;
        if (day<1||day<7){
       System.out.println("day should be in1 to7");
        }
        switch (day){
             case 1:
                System.out.println("monday");
             break;
             case 2:
                System.out.println("tuesday");
             break;
        }
    }
 }
