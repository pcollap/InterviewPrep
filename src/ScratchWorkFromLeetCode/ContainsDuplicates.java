package ScratchWorkFromLeetCode;

import java.util.HashMap;

public class ContainsDuplicates {
    public static void main(String[] args) {

        //Adding comment for explaining purposes

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3,4,4};

        ContainsDuplicates c = new ContainsDuplicates();
        boolean c1 = c.containsDuplicatesFromLeetcode(nums1);
        boolean c2 = c.containsDuplicatesFromMe(nums1);
    }

    private boolean containsDuplicatesFromMe(int[] nums) {
        //This is faster but sometimes they will say don't use use Hashmaps. Only use primitive arrays
        HashMap<Integer, Integer> duplicates =  new HashMap<>();
        boolean containsDuplicates = false;
        for (int num : nums) {
            if (duplicates.get(num) == null) {
                duplicates.put(num, 1);
            } else {
                containsDuplicates = true;
            }
        }
        return containsDuplicates;
    }

    private boolean containsDuplicatesFromLeetcode(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }
}
