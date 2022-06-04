import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        //int[] arr = new int[sc.nextInt()];
        //for(int i=0;i<arr.length;i++) arr[i]= sc.nextInt();
        System.out.println("Array after rotating: "+Arrays.toString(rotate(arr,4)));
    }
    static int[] rotate(int[] arr){
        int first = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--) arr[i] = arr[i-1];
        arr[0] = first;
        return arr;
    }
    static int[] rotate(int[] arr, int count){
        ArrayList<Integer> ar = new ArrayList<>(arr.length);
        for(int i:arr) ar.add(i);
        for(int i=0;i<count;i++) ar.add(0,ar.remove(ar.size()-1));
        int ind=0;
        for(Object i: ar.toArray()) arr[ind++] = (int) i;
        return arr;
    }
}
