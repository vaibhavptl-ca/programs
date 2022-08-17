package interview_prep;

public class MultiplyCorrespondingElements {
    public static void main(String[] args){

        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};


        for(int i = 0; i< a.length; i++){
            int k = a[i] * b[i];
            System.out.println(k + " ");
        }

    }
}
