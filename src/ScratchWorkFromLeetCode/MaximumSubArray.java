package ScratchWorkFromLeetCode;

public class MaximumSubArray {
    public static void main(String[] args) {
//        Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//        A subarray is a contiguous part of an array.
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray ms = new MaximumSubArray();
        ms.maxSubArray(nums);

    }

    public int maxSubArray(int[] nums) {
        int maxSubarray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSubarray = 0;
            for (int j = i; j < nums.length; j++) {
                currentSubarray += nums[j];
                maxSubarray = Math.max(maxSubarray, currentSubarray);
            }
        }

        return maxSubarray;
    }
}
