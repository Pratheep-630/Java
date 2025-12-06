public class CompileTimePolymorphisam{
    public static void main(String[]args){
    Addition sum=new Addition();
    System.out.println("sum is:"+sum.add(6854655,68545));
    }
}

class Addition{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public float add(float n1,float n2){
        return n1+n2;
    }
     public double add(double n1,double n2){
        return n1+n2;
    }
     public int add(int n1,int n2,int n3){
        return n1+n2+n3;
     }
     public long add(long n1, long n2){
        return n1+n2;
     }
}