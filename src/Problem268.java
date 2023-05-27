public class Problem268 {
//    https://leetcode.com/problems/missing-number/submissions/957429041/

    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int n = nums.length;
        // total sum the elements in array nums;
        for(int i : nums) {
            sum1 += i;
        }
        // total sum the elements in [0,n];
        int sum2 = (n*(n+1))/2;
        return sum2-sum1;
    }
}
