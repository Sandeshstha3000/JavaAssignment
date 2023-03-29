package Abstraction;

public abstract class Bank {
    public Bank(){
        System.out.println("call");
    }
    public abstract int getRateOfInterest();
    public void display(){
        System.out.println("this is bank");
    }
    public static void displayBankName(){
        System.out.println("this is main bank");
    }
}
