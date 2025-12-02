public class Encapsulation{
    public static void main(String[]args){
        Account ac1=new Account("458146854458");
        float balance=ac1.getBalance();
        System.out.println("balance is:"+balance);
        float updatedBalance=ac1.transaction(1000);
        System.out.println("the updated balce is:"+updatedBalance);
        System.out.println("trsnsfering 100 rupess:"+ac1.transaction(-100));
    }
}

class Account{
    private float balance;
    String accountNumber;
    protected float getBalance(){
        return balance;
    }
    public Account(String accountNumber){
        this.accountNumber=accountNumber;
    }
    protected float transaction(float amount){
        if(amount<0 &&Math.abs(amount)>this.balance){
            System.out.println("insufficient funds..");
            return this.balance;
        }
        this.balance +=amount;
        return this.balance;
    }
}