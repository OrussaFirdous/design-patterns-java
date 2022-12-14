package strategyPattern;

public class Main{
    public static void main(String[] args){
        Vehicle lambo = new Lamborghini();
        Vehicle corolla = new Toyota();

        lambo.drive();
        corolla.drive();
    }
}