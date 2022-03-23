public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
         int count =0;
        while(n!=0) //cant be >0 because java has no unsigned int
        {
            count += n & 1; //& with 1 will give us if the rightmost bit is 1
            n = n>>>1; //shifts it right by 1 >> is sign change
        }
        return count;
        
    }
}