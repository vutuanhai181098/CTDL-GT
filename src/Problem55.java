public class Problem55 {
//    https://leetcode.com/problems/jump-game/submissions/958039827/

    public static boolean canJump(int[] nums) {
        int countStep = nums[0];
        int i = 0;
        for(i = 1; i < nums.length; i++){
            countStep--;
            if(countStep < 0) break;
            if(countStep < nums[i]){
                countStep = nums[i];
            }
        }
        return i == nums.length;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(canJump(nums1));

        int[] nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums2));
    }
}
