package Array;

public class ArrayEx {
    public void displayArray(){
        int num[] = {1,2,3,4,5}; // or int num[] = new int[5];
          int sum = 0;
          for(int i = 0; i<num.length; i++){
              sum= sum + num[i];
          }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArrayEx b = new ArrayEx();
        b.displayArray();
    }
}
