import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Basic : "+basic(k,arr));
        System.out.println("PriorityQueue : "+priorityQueue(k,arr));
        System.out.println("QuickSort : "+quickSort(k,arr,0,arr.length-1));
    }
    public static int basic(int k, int[] arr){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int priorityQueue(int k,int[] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
            pq.add(arr[i]);
        for(int i=0;i<k-2;i++)
            pq.remove();
        return pq.remove();
    }
    public static int quickSort(int k, int[] arr,int start, int end)
    {
        if(start < end) {
            int partitionindex = quickSortPartition(arr, start, end);
            quickSort(k,arr,start,partitionindex-1);
            quickSort(k,arr,partitionindex+1,end);
        }
        return arr[k-1];
    }
    public static int quickSortPartition(int[] arr, int start, int end){
        int pindex = start, temp;
        int pivot =end;
//        System.out.println("START : "+Arrays.toString(arr));
        for(int i=start;i<end;i++)
            if(arr[i]<arr[pivot])
            {
                temp = arr[pindex];
                arr[pindex] = arr[i];
                arr[i] = temp;
                pindex++;
            }
        temp = arr[pindex];
        arr[pindex] = arr[pivot];
        arr[pivot] = temp;
//        System.out.println("END : "+Arrays.toString(arr));
        return pindex;
    }
}
//20 5 4 7 9 8 6 1 0 5 4 6 15 4 9 7 6 3 1 4 6 10
//8 7 2 1 6 8 5 3 4 3