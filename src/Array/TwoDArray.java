package Array;

public class TwoDArray {
    public void courseArray() {
        String[][] course = {{"Java", "c", "c++"}, {"F", "s", "G"}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(course[i][j]);
            }
            System.out.println();
        }

    }
        public static void main (String[]args){
            TwoDArray b = new TwoDArray();
            b.courseArray();
        }
    }
