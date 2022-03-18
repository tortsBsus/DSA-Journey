class Solution {
    public int[] plusOne(int[] digits) {
        
    
    
        int x = 1;
        while((digits.length - x) >= 0 && digits[digits.length - x]==9) //check if a digit is 9
        {digits[digits.length - x] =0;//make digit 0 and check to the left
        x++;
        }//continue till left digit is not a 9
        
        //expand array if left-most digit is 9 
        if(digits.length - x < 0){
            
            int []temp = new int[digits.length+1];
            temp[0] = 1;
            for(int a = 1;a<temp.length;a++)
            {
                temp[a] = digits[a-1];
            }
            return temp;
        }
        
        // make leftmost digit 1
         digits[digits.length - x] += 1;
                       
        return digits;
    }
}