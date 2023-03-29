package Inheritance.SingleInheritance.HybridInheritance;

public class HybridOutput {
    public static void main(String[] args) {
        HybridB a = new HybridB();
        HybridD b = new HybridD();
        a.MetB();
        a.MetA();
        b.MetA();
        b.MetC();
        b.MetD();
    }
}
