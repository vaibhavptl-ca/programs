package interview_prep;

public class MaxProductOfArray {

    public static void main(String[] args){
        int[] array = {10,20,30,40,50,60};
        MaxProductOfArray maxProduct = new MaxProductOfArray();
        String pairs = maxProduct.maxProducts(array);
        System.out.println(pairs);
    }
    
    public String maxProducts(int[] array){
        int maxProduct = 0;
        String pairs = "";
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                int product = array[i]*array[j];
                if(product > maxProduct){
                    maxProduct = product;
                    pairs = array[i] + "," + array[j];
                }
            }
        }
        return pairs;
    }
}
