package ControlStatement.DecisonMaking.LoopStatement;

import java.util.Scanner;

public class loopEx {
    public void displayForLoop(){
        for (int i = 0; i<5; i++) {
            System.out.println("Hello: ");
        }
    }

    public void userName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("name is: " + name);
        for (int i = 0; i<5; i++) {
            System.out.println("name: "+ name);
        }
    }
    public void displayWhileLoop(){
    int i= 1;
    int j = 5;
    while (i <= 10) {
            System.out.println(j + "*" + i + "= " + j*i);
            i++;
        }
    }

    public void displayDoWhileLoop(){
        int i= 1;
        int j = 5;
        do{
            System.out.println(j + "*" + i + "= " + j*i);
            i++;
        }
        while (i <= 10);
    }

}

