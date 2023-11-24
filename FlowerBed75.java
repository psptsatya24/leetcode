package org.leetcode;

public class FlowerBed75 {

    private boolean  canPlaceFlowers(int[] flowerBed , int i){
        int counter = 0;
        //if flowerBed is even array

            for (int j = 0; j < flowerBed.length - 1; j++) {
                if (flowerBed[j] == 0 && flowerBed[j + 1] == 0) {
                    counter++;
                    j++;
                }
            }
            //A special condition when flower bed is of odd length.
            if (flowerBed.length%2 !=0 && flowerBed[flowerBed.length-1] ==0 && flowerBed[flowerBed.length -2] ==0)
                counter++;

        if(counter>=i) return true;
        else return false;

       // return true;
    }
    //1.22 Pm
    public static void main(String args[]){
        int[] flowerBedArray = {0,0,0 };

        FlowerBed75 flowerBed75 = new FlowerBed75();
        System.out.println("The result is :" + flowerBed75.canPlaceFlowers(flowerBedArray, 2));
    }
}
