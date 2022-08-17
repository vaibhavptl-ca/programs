package interview_prep;


public class ReverseArray {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = arr.length - 1;
        int size = arr.length;

        printArray(arr, size);

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr, size);
    }

    static void printArray(int arr[],
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
