package Array;

public class ArrayS {
    public void displayArray() {
        String[] course = {"java", "C++","C"};
        for (String Str:course) {
            System.out.println(Str);
        }
        System.out.println(course[1]);
    }

    public static void main(String[] args) {
        ArrayS b = new ArrayS();
        b.displayArray();
    }
}
