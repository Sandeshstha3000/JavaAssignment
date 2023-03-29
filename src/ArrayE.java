
public class ArrayE {
    public void displayArray() {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArrayE b = new ArrayE();
        b.displayArray();
    }
}
