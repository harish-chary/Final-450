import java.util.*;
public class ZeroOneTwo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i=0; i< str.length; i++)
            arr[i] = Integer.valueOf(str[i]);
        zeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void method1(int[] arr)
    {
        //Finding count of each number and adding it at the end
        int sum=0,count=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(arr[i]==2)  count++;
        }
        for(int i=arr.length-1; i>-1; i--)
            if(count-->0){ arr[i] = 2; sum-=2;}
            else if(sum-->0) arr[i] = 1;
            else arr[i] = 0;
    }
    public static void swap(int[] arr,int i,int j)
    {
        if(i!=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;}
    }
    public static void  zeroOneTwo(int[] arr)
    {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
            if(arr[mid]==0) { swap(arr,mid,low); low++; mid++; }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2) { swap(arr,mid,high); high--; }
    }
}
