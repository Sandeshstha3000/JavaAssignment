package ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int a = sc.nextInt();

        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("cant divide by zero");
        }
        finally {
            System.out.println("it is always executed");
        }
    }
    public void displayAge(int age){
        if (age < 20){
            throw new ArithmeticException("teenage");
        }else {
            System.out.println("good to go");
        }
    }
}

