class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int a: nums){
        
            int digits =0;
            for(int x = a;x!=0;x=x/10)
            {
                digits++;
            }
            if(digits % 2 ==0) count++;
            
        }
        return count;
    }
}