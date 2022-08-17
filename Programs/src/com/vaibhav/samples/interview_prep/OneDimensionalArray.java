package interview_prep;

public class OneDimensionalArray {

    static int arr[] = null;

    public static void main(String args[]){

        OneDimensionalArray array = new OneDimensionalArray(10);

        array.insert(0,0);
        array. insert(1,10);
        array. insert(2,11);
        array.insert(1,12);
        array.insert(3,50);
        array.insert(12,120);

    }

    public OneDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public static void insert(int locationOrIndex, int valueToBeInserted){
        //If the locationValue is equals to the Integer.MIN_VALUE
        try {
            if (arr[locationOrIndex] == Integer.MIN_VALUE) {
                arr[locationOrIndex] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index as it exceeds the size of array");
        }
    }

    public static void traverseArray(){
        try {
            for(int i = 0; i <arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }
        catch (Exception ex){
            System.out.println("Array no longer exists");
        }
    }

    public static void searchArray(int valueToBeSearched){

        for(int i = 0 ; i <arr.length; i++){
            if(arr[i] == valueToBeSearched){
                System.out.println("Value is found at index : " + i);
                return;
            }
            else {
                System.out.println("Value not found");
            }
        }
    }


    public static void deleteArray(int valueToBeDeletedIndex){
      try {
          arr[valueToBeDeletedIndex] = Integer.MIN_VALUE;
          System.out.println("Value is deleted successfully");
      }
      catch (ArrayIndexOutOfBoundsException ex){
          System.out.println("Value provided is not in range of array");
      }
    }
// Time complexity will be O(1) for all
}
