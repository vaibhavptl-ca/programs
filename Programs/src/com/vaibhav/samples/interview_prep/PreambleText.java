package interview_prep;

public class PreambleText {

    public static void main(String[] args){
        String str = "<john> hello there!";

        int indexStart = str.indexOf("<")+1;
        int indexEnd = str.indexOf(">");

        String username = str.substring(indexStart, indexEnd);

        System.out.println(username);
    }
}
