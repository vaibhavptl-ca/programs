package interview_prep;

public class ArrayRotation {

    /**
     *
     * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 3, n =7
     * 1) Store the first d elements in a temp array
     *    temp[] = [1, 2]
     * 2) Shift rest of the arr[]
     *    arr[] = [3, 4, 5, 6, 7, 6, 7]
     * 3) Store back the d elements
     *    arr[] = [3, 4, 5, 6, 7, 1, 2]
     *
     */

    public static void main(String[] args)
    {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.rotateArray(arr, 2, 7);
        rotate.printArray(arr,7);
    }

    void rotateArray(int arr[], int removeByPosition, int n){
        for(int i = 0 ; i < removeByPosition; i++)
        rotate(arr,n);
    }

    void rotate(int arr[], int n){
        int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[n - 1] = temp;
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
