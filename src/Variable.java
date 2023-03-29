public class Variable {
    //static variable
    static int d = 555;
    //instance variable
    int b = 777;

    //method
    public void Display(){
        //Local variable
        int a = 5;
        System.out.println("local variable is:" +a);
        System.out.println("local variable is:" +b);
    }

   //main method
   public static void main(String[] args) {
        Variable abcd = new Variable();
        abcd.Display();
       System.out.println(abcd.b);
       System.out.println(Variable.d);
    }
}
