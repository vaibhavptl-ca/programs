package interview_prep;

public class ReverseInteger {
    public static void main(String[] args){
        int num = 123;
        int reversedNum = 0;

        while(num != 0){
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        System.out.println("Reversed Number is : "+ reversedNum);
    }
}
