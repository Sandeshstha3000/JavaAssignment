package Encapsulation;

public class OutputStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(548);
        student.setName("sandesh");
        System.out.println(student.getName() + " " + student.getId());
    }
}
