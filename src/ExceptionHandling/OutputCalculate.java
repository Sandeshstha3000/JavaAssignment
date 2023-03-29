package ExceptionHandling;

public class OutputCalculate {
    public static void main(String[] args) {
        Calculator abcd = new Calculator();
        //abcd.calculator();
        try{
            abcd.displayAge(10);
        }catch (ArithmeticException e){
            System.out.println("age is less");
        }

        }
    }

