package interview_prep;

public class PlaceFlowers {

    public static void main(String[] args) {

        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 1));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n){ // O(N)
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftPlot = (i - 1 < 0 || flowerbed [i-1] == 0);
                boolean rightPlot = (i + 1 >= flowerbed.length || flowerbed [i+1] == 0);

                if(leftPlot && rightPlot){
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
}
