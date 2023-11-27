package org.leetcode;

public class IncreasingTripletSequence {

    public boolean increasingTriplet(int[] nums) {

        if(nums.length <3) return false;

        int i = Integer.MAX_VALUE , j = Integer.MAX_VALUE;
        for (int index = 0; index<nums.length;index++) {
            if(nums[index]<=i) {
                i = nums[index];
            }
            else{
                if(nums[index] <= j) {
                    j = nums[index];
                }
                else
                    return true;
            }
           // return false;
        }


        return false;
    }

    public static void main(String args[]) {
        int[] list = {20,100,10,12,5,13};
        IncreasingTripletSequence tripletSequence = new IncreasingTripletSequence();
        System.out.println(tripletSequence.increasingTriplet(list));
    }
}
