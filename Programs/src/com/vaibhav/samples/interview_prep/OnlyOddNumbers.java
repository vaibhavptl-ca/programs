package interview_prep;

public class OnlyOddNumbers {

    public static void main(String[] args) {
        System.out.println(
                oddCheck(39)
        );
    }

    public static boolean oddCheck(int num){
        if(num%2 == 0){
            return false;
        }

        return true;
    }
}
