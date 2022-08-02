class Solution {
    public int[] runningSum(int[] nums) {
        for(int a=0; a<nums.length;a++)
        {
            if(a==0)continue;
            nums[a]=nums[a]+nums[a-1];
        }
        return nums;
    }
}