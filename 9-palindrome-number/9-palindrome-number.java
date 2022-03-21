class Solution {
    public boolean isPalindrome(int x) {
        
       if (x < 0) return false;
        //method 2 : reverse only the second half of the number to avoid overflow. 
        if(x%10 ==0 && x!=0 ) return false; //if a number ends with 0 but is not 0, it is not pallindrome
        if(x<=9) return true;
        int r = 0;
        int n = x;
        
        while (r<n){
            r = r*10 + n%10;
            n = n / 10;
            System.out.println(n + " " + r);
        }
        
      return n == r || n == r/10;  
        
    }
}