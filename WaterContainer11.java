package org.leetcode;

public class WaterContainer11 {
    public int maxArea(int[] height) {

        int leftValue = height[0];
        int rightValue = height[height.length-1];
        int leftPointer = 1;
        int rightPointer = height.length;
        int area = 0;
        int areaNow = 0;

        for (int i = 0; i < height.length ;i++) {
            if (rightPointer==leftPointer)
                return area;

            areaNow = Math.min(rightValue,leftValue) * (rightPointer-leftPointer) ;
            if (areaNow > area)
                area= areaNow;

            if (leftValue >= rightValue) {
                rightPointer = rightPointer-1;
                rightValue = height[rightPointer-1];
            }
            else{
                leftPointer= leftPointer+1;
                leftValue= height[leftPointer-1];
            }
        }
        return area;
    }
    //6:43
    public static void main(String args[]) {
        WaterContainer11 container = new WaterContainer11();
        int[] heights = {2,3,4,5,18,17,6};
        System.out.println("Max Area:"+container.maxArea(heights));
    }
}
