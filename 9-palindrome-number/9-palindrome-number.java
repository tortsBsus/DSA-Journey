class Solution {
    public boolean isPalindrome(int x) {
        
       if (x < 0) return false;
        //method 2 : reverse only the second half of the number to avoid overflow. 
        if(x%10 ==0 && x!=0 ) return false; //if a number ends with 0 but is not 0, it is not pallindrome
        if(x<=9) return true;
        int r = 0;
      
        
        while (r<x){
            r = r*10 + x%10;
            x = x / 10;
            System.out.println(x + " " + r);
        }
        
      return x == r || x == r/10;  
        
    }
}