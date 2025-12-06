public class Generics{
public static void main(String[]args){
    Addition<Integer> addition=new Addition<>(23,55);
    System.out.println("Addition is:"+addition.add());
}
}

//generic class
class Addition<T extends Number>{
    T num1;
    T num2;
    public Addition(T num,T num2){
        this.num1=num;
        this.num2=num2;
    }
    @SuppressWarnings("UnnecessaryBoxing")
    public T add(){
        return (T) Integer.valueOf(num1.intValue() + num2.intValue());
    }
}
