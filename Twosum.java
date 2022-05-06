package LeetCode;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] num = { 1, 3, 4, 6, 9, 7, 13, 16, 0, 0 };
        int target = 0;

        System.out.println(Arrays.toString(twoSum(num, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (i + 1 < nums.length) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result = new int[] { i, j };
                        return result;
                    }
                }
            }
        }

        return null;
    }
}