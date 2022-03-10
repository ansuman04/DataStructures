package LeetCode;

import java.util.Arrays;

public class Question1984 {
    

    public int minimumDifference(int[] nums, int k) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - k; i++) {
            minDiff = Math.min(minDiff, Math.abs(nums[i + k - 1] - nums[i]));

        }

        return minDiff;
    }
   public static void main(String args[]){
       Question1984 question1984 = new Question1984();
       int[] nums = new int[]{9,4,1,7};
       int diff = question1984.minimumDifference(nums,2);
       System.out.print(diff);
   }
    
}
