public class Abstraction{
    public static void main(String[]args){
        Vehicle car = new BMW();
        car.startEngine();
        car.changeGears(1);
        car.increaseSpeed(20);
        car.changeGears(2);
        car.increaseSpeed(40);
        car.changeGears(3);
        car.increaseSpeed(80);
        car.changeGears(4);
        car.increaseSpeed(100);
        car.stopEngine();
    }
}

abstract class Vehicle{
    abstract String startEngine();
    abstract String stopEngine();
    abstract int changeGears(int gear);
    abstract double increaseSpeed(double speed);
    abstract String applyBreaks();
    String vehicleTest(){
        System.out.println("this is inside of abstract class.. ");
        return "testing..";
    }
}

class BMW extends Vehicle{
    String startEngine(){
        System.out.println("engine started..");
        return "engine started..";
    }
    String stopEngine(){
        System.out.println("engine stopped..");
        return "engine stopped..";
    }
    int changeGears(int gear){
        System.out.println("changed gears: " + gear);
        return gear;
    }
    double increaseSpeed(double speed){
        System.out.println("increased speed to: " + speed);
        return speed;
    }
    String applyBreaks(){
        System.out.println("breaks applied..");
        return "breaks applied..";
    }
}
