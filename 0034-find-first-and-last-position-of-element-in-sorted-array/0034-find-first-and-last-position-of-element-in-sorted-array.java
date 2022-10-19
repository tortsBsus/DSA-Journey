class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start =0;
        int end = nums.length-1;
        int[] answer = {-1,-1};
        answer[0]= helper(nums,target,true);
        answer[1]= helper(nums,target,false);
        return answer;
    }
    
    static int helper(int[]nums,int target, boolean first ){
        int ans=-1; 
        int start =0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]) end = mid-1;
            else if(target>nums[mid]) start = mid+1;
            else {
                ans = mid;
                if(first){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
               
            }
            
        }
        return ans;
    }
}