package org.leetcode;

public class MaxProductOf2Elements1464 {

    public int maxProduct(int[] nums) {
       int product = 0;
       int num1 = Integer.MIN_VALUE; //largest number
       int num2 = Integer.MIN_VALUE; // second largest

       for (int i = 0 ; i < nums.length ; i++ ){

           if(nums[i] >= num1) {
               num2 = num1;
               num1 = nums[i];
           } else{
               if(nums[i] >= num2) {
                   num2 = nums[i];
               }
           }

        }

       return (num1-1) *(num2-1);
    }

    public static void main(String args[]) {
        MaxProductOf2Elements1464 obj = new MaxProductOf2Elements1464();
        int[] nums = {3,7};
        System.out.println(obj.maxProduct(nums));
    }
}
