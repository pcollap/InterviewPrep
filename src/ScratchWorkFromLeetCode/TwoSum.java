package ScratchWorkFromLeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.

//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] nums ={2,7,11,15};
        TwoSum ts = new TwoSum();
        int[] twoSumIndexes1 = ts.twoSum(nums, 9);

        int[] twoSumIndexes2 = ts.twoSumWithMapLeetCode(nums, 9);

    }

    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[]{};
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if (nums[i] + nums[j] == target)
                        return new int[]{i, j};
                }
            }
        }
        return twoSum;
    }

    public int[] twoSumWithMapLeetCode(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }


}
