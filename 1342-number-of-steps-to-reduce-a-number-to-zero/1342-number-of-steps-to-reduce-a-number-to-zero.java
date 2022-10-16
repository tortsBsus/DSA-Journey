class Solution {
    public int numberOfSteps(int num) {
        int steps =0;
        steps = helper(num, steps);
        return steps;
        
    }
    
    static int helper(int n, int steps){
        if(n==0)return steps;
        if(n%2==0)return helper(n/2,++steps);
        return helper(n-1,++steps);
    }
}