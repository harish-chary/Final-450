import java.util.*;
class Solution{
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), arr[]=new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  System.out.println(maxSubarraySum(arr,n));
  }
  
    long maxSubarraySum(int arr[], int n){
        // Brute Force
        // int max=Integer.MIN_VALUE, sum;
        // for(int i=0;i<n;i++) {
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(max<sum) max=sum;
        //     }
        // }
        // return max;
        
        
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
            if(max<sum) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    
}
