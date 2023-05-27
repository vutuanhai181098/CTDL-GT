public class Problem1920 {

//    https://leetcode.com/problems/build-array-from-permutation/submissions/957432042/

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
