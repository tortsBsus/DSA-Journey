class Solution {
    
    int leftSum(int[] nums, int idx)
    {
        int sum =0;
        for(int a =0;a<idx;a++)
        {
            sum+=nums[a];
        }
        return sum;
    }
     int rightSum(int[] nums, int idx)
    {
        int sum =0;
        for(int a =idx+1;a<nums.length;a++)
        {
            sum+=nums[a];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int leftSumRes;
        int rightSumRes;
        for(int a =0;a<nums.length;a++)
        {
            leftSumRes = leftSum(nums,a);
            rightSumRes = rightSum(nums,a);
            if(leftSumRes==rightSumRes)return a;
        }
        return -1;
    }
}