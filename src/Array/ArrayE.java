package Array;

public class ArrayE {
    public void displayArray() {
        int[] num = {1, 2, 3, 4, 5}; // Declare and initialize an integer array called "num" with values 1 through 5
        int sum = 0; // Declare and initialize an integer variable called "sum" with a value of 0
        for (int n : num) { // Begin a for-each loop that will iterate over each element "n" in the array "num"
            sum += n; // Add the value of "n" to the variable "sum"
        }
        System.out.println(sum); // Print the final value of "sum" to the console
    }

    public static void main(String[] args) {
        ArrayE b = new ArrayE();
        b.displayArray();
    }
}
