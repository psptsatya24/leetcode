package org.leetcode;

public class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        if (nums.length ==1)
            System.out.println(nums[0]);

        int firstPointer = 0;
        int secondPointer = 1 ;

        while (firstPointer < nums.length && secondPointer < nums.length ) {
            if(nums[secondPointer] != 0 ) {
                while(! (nums[firstPointer] == 0) && firstPointer < secondPointer)
                    firstPointer++;
                if (nums[firstPointer] == 0) {
                    int temp = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp;
                    firstPointer++;
                }
            }
            secondPointer++;
        }
        for(int i : nums){
            System.out.println(i);
        }

    }
    public static void main(String args[]){
        MoveZeros283 moveZeros283 = new MoveZeros283();
        int[] nums = {0,2,3,1,12};
        moveZeros283.moveZeroes(nums);
    }
}
