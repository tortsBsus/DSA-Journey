class Solution {
    public double average(int[] salary) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avg =0;
        for(int a =0;a<salary.length;a++)
        {
            if(salary[a]>max)max = salary[a];
            if(salary[a]<min)min = salary[a];
            avg +=salary[a];
            
        }
    
        avg = (avg - max - min ) / (salary.length - 2);
        return avg;
    }
}