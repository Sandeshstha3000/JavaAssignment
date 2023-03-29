package Array;

import java.util.ArrayList;

public class ArrayListEx {
    public void displayCourses(){
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList);
        arrayList.add("java");
        arrayList.add("C");
        arrayList.add("c++");
        System.out.println(arrayList);

        for(String course: arrayList){
            System.out.println(course);
        }
        System.out.println(arrayList.size());
    }
    public void student(){
        ArrayList<Student> student = new ArrayList<>();
        Student stud = new Student();
        stud.setId(12);
        stud.setName("Java");
        student.add(stud);
        System.out.println(student);


    }
}
