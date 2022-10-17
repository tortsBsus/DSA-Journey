class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth =-1;
        //calculate wealth of each
        for(int[] person: accounts){
            int wealth =0;
            for(int bank: person){
                wealth+= bank;
            }
            if(wealth>maxWealth) maxWealth = wealth;
        }
        return maxWealth;
    }
}