class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int ans[] = new int[n*2];
        for(int a = 0;a<n;a++)
        {
            ans[a]=nums[a]; 
            ans[a+n]=nums[a];
        }
        return ans;
        
    }
}