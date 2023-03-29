package ControlStatement.DecisonMaking;

import java.util.Scanner;

public class College {
    public void displayId() {
        int a = 54;

        if (a == 548) {
            System.out.println("Id is 548");
        } else {
            System.out.println("Id Incoorrect");
        }

    }

    public void displayName() {
        //String s = "sandesh";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String a = sc.nextLine();
        if (a.equals("sandesh")) {
            System.out.println("name:" + a);
        } else {
            System.out.println("name not found");
        }

    }

    public void switchMarks() {
        int marks = 40;
        switch (marks) {
            case 20:
                System.out.println("D");
                break;
            case 10:
                System.out.println("f");
                break;
            case 40:
                System.out.println("A");
                break;
            default:
                System.out.println("cannot find marks");
        }
    }


}
