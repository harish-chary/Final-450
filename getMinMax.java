/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long arr[], long n)  
    {
        //Write your code here
        long min=arr[0],max=arr[0];
        for(long i : arr) {
            min = i<min ? i : min;
            max = i>max ? i : max;
        }
        return new pair(min,max);
    }
}
