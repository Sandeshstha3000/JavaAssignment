package NonAccessModifier;

import java.util.Scanner;

public class StaticEx {
    public static int cube(int a){
        return a*a*a;
    }
    public static float perimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        float l = sc.nextFloat();
        System.out.println("enter breadth");
        float b = sc.nextFloat();
        return l*b;
    }
    public static float peri(float l,float b){
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        float l = sc.nextFloat();
        System.out.println("enter breadth");
        float b = sc.nextFloat();*/
        return l*b;
    }
}
