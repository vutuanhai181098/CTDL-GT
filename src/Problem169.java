import java.util.Arrays;

public class Problem169 {
//    https://leetcode.com/problems/majority-element/submissions/957212750/

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
