class Solution {
    public int[] plusOne(int[] digits) {
        
    
        //case 1 : last digit is 9
        int x = 1;
        while((digits.length - x) >= 0 && digits[digits.length - x]==9)
        {digits[digits.length - x] =0;
        x++;
        }
        if(digits.length - x < 0){
            
            int []temp = new int[digits.length+1];
            temp[0] = 1;
            for(int a = 1;a<temp.length;a++)
            {
                temp[a] = digits[a-1];
            }
            return temp;
        }
         digits[digits.length - x] += 1;
                        return digits;
    }
}