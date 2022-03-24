class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //approach 1 : loop through it
        int []answer = new int[2];
        for(int a = 0; a<nums.length;a++){
            
            for(int b =a+1; b<nums.length;b++){
                if(nums[a]+nums[b] == target) {answer[0] = a; answer[1] = b;}
            }
        }
        
        return answer;
        
    }
}