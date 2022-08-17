package interview_prep;

public class WordCount {

    public static void main(String[] args){

        String str = "Hello The Best Programmer";

        String[] words = str.split(" ");

        int wordCount = 0;

        for(String s : words){
            wordCount++;
        }

        System.out.println("Total words : "+wordCount);
    }


}
