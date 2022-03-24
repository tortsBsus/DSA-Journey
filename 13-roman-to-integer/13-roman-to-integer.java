class Solution {
    public int romanToInt(String s) {
        
        int ans =0;
        for(int a =0;a<s.length();a++)
        {
            switch(s.charAt(a))
            {
                case 'I': ans += 1;    if( (a != s.length() - 1) && ( s.charAt(a+1)=='V' || s.charAt(a+1)=='X' )) ans -= 2;   break;
                case 'V': ans += 5;    break;
                case 'X': ans += 10;   if( (a != s.length() - 1) && ( s.charAt(a+1)=='L' || s.charAt(a+1)=='C' )) ans -= 20;   break;
                case 'L': ans += 50;   break;
                case 'C': ans += 100;  if( (a != s.length() - 1) && ( s.charAt(a+1)=='D' || s.charAt(a+1)=='M' )) ans -= 200;   break;
                case 'D': ans += 500;  break;
                case 'M': ans += 1000; break;
            }
        }
        return ans;
    }
}