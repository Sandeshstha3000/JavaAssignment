package Inheritance.SingleInheritance.HierarchialInheritance;

public class HierarchyOutput {
    public static void main(String[] args) {
        HierarchyB ab = new HierarchyB();
        HierarchyC abc = new HierarchyC();
        ab.MetA();
        ab.MetB();
        abc.MetA();
        abc.MetC();
    }
}
