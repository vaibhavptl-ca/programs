package interview_prep;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        System.out.println(removeSpaces("Hello Missisipi"));
    }

    public static String removeSpaces(String s){
        return  s.toLowerCase().trim().replaceAll("\\s","");
    }
}
