public class Problem1470 {
//    https://leetcode.com/problems/shuffle-the-array/submissions/957402964/

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for(int i = 0; i < n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
}
