package Operators;

import java.util.Scanner;

public class Operator {
    public void ArithmeticOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("sum of numbers is:" + (a + b));

    }
    public void ArithmeticOperatorMultiply(){
        int a = 5;
        int b = 7;
        System.out.println("Multiplication of numbers is:" + (a * b));
    }

    public void ArithmeticOperatorDivide() {
        int a = 5;
        int b = 7;
        System.out.println("Division of numbers is:" + (a / b));
    }

    public void DisplayName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String s = sc.nextLine();
        System.out.println("Your name is: " + s);
    }
}
