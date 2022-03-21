class Solution {
    public boolean isPalindrome(String s) {
        
        String n = "";
        String r = "";
        for(int a =0;a<s.length();a++){
            
            char x = s.charAt(a);
            
            //Uppercase
            if(x>='A'&&x<='Z'){x = (char)((int)x + 32); n = n + x; r = x + r;}
            //lowercase or number
            else if((x>='a'&&x<='z') || (x >='0' &&x<='9') ){ n = n + x; r = x + r;}
            
            //else not alphanumeric
            
           
        }
        
        return n.equals(r);
        
    }
}