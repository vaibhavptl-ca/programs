package interview_prep;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(palindromeCheck("Kanak"));
    }

    public static boolean palindromeCheck(String s){

        boolean result = true;

        int length = s.length();

        for(int i = 0 ; i < length/2; i++){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(length - i -1)){
                result= false;
                break;
            }
        }
        return result;
    }
}
