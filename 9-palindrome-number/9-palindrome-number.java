class Solution {
    public boolean isPalindrome(int x) {
        
       if (x < 0) return false;
        //method 1 : reverse the number, check if the reversed and original match
        
        int r = 0;
        int n = x;
        
        while (n!=0){
            r = r*10 + n%10;
            n = n / 10;
        }
        
        if (r == x) return true;
        else return false;
        
        
    }
}