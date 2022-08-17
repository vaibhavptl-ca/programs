package interview_prep;

public class DigitCount {

    public static void main(String[] args){
        digits(12131313);
        sumOfDigits(5412);
    }

    public static void digits(int num) {

        int digitCount = 0;

        while (num > 0){
            num = num/10;
            digitCount++;
        }
        System.out.println("The no of total digits are : "+digitCount);
    }

    public static void sumOfDigits(int num) {

        int sumOfDigit = 0;

        while (num > 0){
            int remainder = num % 10;
            sumOfDigit += remainder;
            num = num/10;
        }
        System.out.println("The no of total digits are : "+sumOfDigit);
    }
}
