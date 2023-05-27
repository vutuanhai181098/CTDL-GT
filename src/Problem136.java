import java.util.Arrays;

public class Problem136 {
//    https://leetcode.com/problems/single-number/submissions/957180813/

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; i+=2){
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length - 1];
    }
}
