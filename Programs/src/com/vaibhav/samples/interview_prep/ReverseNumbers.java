package interview_prep;

public class ReverseNumbers {


    public static void main(String[] args){
      reversNums(12345);
    }

    public static void reversNums(int num){

        int reversedNum = 0;

        while (num > 0){
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num/10;
        }
        System.out.println("Reversed Number is : "+ reversedNum);
    }
}
