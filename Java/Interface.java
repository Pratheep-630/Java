public class Interface{
    public static void main (String []args){
        Phonepe p= new Phonepe();
        p.sendMoneyViaContact(1000);
       
    }
}

interface UPIInterface{
    String sendMoneyViaContact(float amount);
   String sendMoneyViaBankAccount(float amount);
    String sendMoneyViaUpiId(float amount);

}

class Phonepe implements UPIInterface{

    int sendsendMoneyViaContact;
    public String sendMoneyViaContact(float amount ){
        System.out.println("transaction successfull via contact..");
        return "success";
    }
     public String sendMoneyViaBankAccount(float amoun ){
        System.out.println("transaction successfull via bank account..");
        return "success";
    }
     public String sendMoneyViaUpiId(float amount){
        System.out.println("transaction successfull via UpiId..");
        return "success";
    }
}

class Gpay implements UPIInterface{
    public String sendMoneyViaContact(float amount ){
        System.out.println("transaction successfull via contact..");
        return "success";
    }
     public String sendMoneyViaBankAccount(float amoun ){
        System.out.println("transaction successfull via bank account..");
        return "success";
    }
     public String sendMoneyViaUpiId(float amount){
        System.out.println("transaction successfull via UpiId..");
        return "success";
    }
}