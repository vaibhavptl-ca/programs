package interview_prep;

public class SumOf100Nos {

    public static void main(String[] args){
        System.out.println(sumOf100Nums(100));
        System.out.println(sumOfEvenNumbers(10));
        swapNumbers(3,7);
        System.out.println(sumOFAllNumbers(5124));
    }

    public static int sumOf100Nums(int num){

        int sum = 0;
        int avg = 0;
        for(int i = 0 ; i <= num; i++){
            sum = sum + i;
            avg = sum/num;
        }
        System.out.println("avg " +avg);
        return sum;
    }

    public static int sumOfEvenNumbers(int num){

        int sum = 0;
        for(int i = 1 ; i <= num; i++){
            if (i % 2  == 0){
            sum += i;
            }
        }

        return sum;
    }

    public static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Numbers are a:"+ a + " b:" + b);
    }

    public static int sumOFAllNumbers(int number){

        while (number >= 10){
            int temp = 0;

            while(number > 0){
                int pop = number % 10;
                temp = temp + pop;
                number = number / 10;
            }
            number = temp;
        }
        return number;
    }
}
