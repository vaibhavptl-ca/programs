package interview_prep;

public class SumOfArray {

    public static void main(String[] args){
        int[] numbers = {1,5,3,7,5,4};
        sumOfArray(numbers);
    }

    public static void sumOfArray(int[] numbers){

        int sum = 0;
        for(int i:numbers){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
