package interview_prep;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNumber(19));
        System.out.println(primeNumber(49));

    }

    public static boolean primeNumber(int num){

        if(num == 0 || num == 1) return false;

        if(num == 2){
            return true;
        }
        for(int i=2; i<=num/2; i++){

            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

