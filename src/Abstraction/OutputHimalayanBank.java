package Abstraction;

public class OutputHimalayanBank {
    public static void main(String[] args) {
        HimalayanBank himalayan = new HimalayanBank();
        //abstract method
        himalayan.getRateOfInterest();

        //non-abstract method
        himalayan.display();

        //static method
        HimalayanBank.displayBankName();
    }
}
