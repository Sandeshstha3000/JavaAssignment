package Assignment;

import java.util.Scanner;

public class Assignment {
   public void Result(){

        Scanner enter = new Scanner(System.in);
       Scanner enter1 = new Scanner(System.in);

        System.out.println("Enter marks of math: ");
        int mathMarks = enter.nextInt();
        System.out.println("marks of math is: " + mathMarks);

        System.out.println("Enter marks of science: ");
        int scienceMarks = enter1.nextInt();
        System.out.println("Marks of science is: " + scienceMarks);

        if(mathMarks >= 40 && scienceMarks >=40){
            System.out.println("you are pass");
        } else if (mathMarks <= 35 && scienceMarks <= 35) {
                System.out.println("you are almost pass");
        } else {
            System.out.println("you are fail");
        }
    }
}
