package interview_prep;

public class PrintPyramid {

    public static void main(String[] args) {
        printPyramid(5);
        numberPrintPyramid(5);
    }

    public static void printPyramid(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPrintPyramid(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

}
