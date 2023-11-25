package org.leetcode;

public class FlowerBed75 {

      private boolean  canPlaceFlowers(int[] flowerbed , int n){
        int counter = 0;
        int currentPointer = 0;
        int prevPointer =0;
        int nextPointer = 0;
         for (int j = 0; j <= flowerbed.length-1 ; j++) {
               currentPointer = flowerbed[j];
               if (j> 0){
                   prevPointer = flowerbed[j-1];
               }
               else
                   prevPointer = 0;

               //nextPointer = flowerbed[j+1];
               if (j+1 == flowerbed.length)
                   nextPointer=0;
               else nextPointer = flowerbed[j+1];

               if( prevPointer ==0 && nextPointer == 0 && currentPointer !=1) {
                   counter++;
                   flowerbed[j]=1;
               }
        }

        if(counter>=n) return true;
        else return false;
    }
    public static void main(String args[]){
        int[] flowerBedArray = {0,0,0 };

        FlowerBed75 flowerBed75 = new FlowerBed75();
        System.out.println("The result is :" + flowerBed75.canPlaceFlowers(flowerBedArray, 2));
    }
}
