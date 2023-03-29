package Casting;

public class Casting {
    public void wideningCasting(){
        int a = 5;
        System.out.println("Before casting: " + a);

        float b= a;
        System.out.println("After Casting: " + b);

    }
    public void narrowingCasting(){
        float f = 5.6f;
        System.out.println("Before casting: " + f);

        int a = (int) f;
        System.out.println("After Casting: " + a);

    }
}
