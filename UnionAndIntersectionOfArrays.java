import java.util.*;
public class UnionAndIntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m = 5,n=6;
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,3,4,6,7,8,9,10,11};
        int m = sc.nextInt(), arr1[] = new int[m];
        for(int i=0;i<m;i++) arr1[i] = sc.nextInt();
        int n=sc.nextInt(), arr2[]=new int[n];
        for(int i=0;i<n;i++) arr2[i] = sc.nextInt();
        System.out.println("Union= "+Arrays.toString(intersection(arr1,m,arr2,n)));
    }
    static int[] union(int[] arr1, int m, int[] arr2, int n){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<m;i++) hs.add(arr1[i]);
        for(int i=0;i<n;i++) hs.add(arr2[i]);
        int[] ans = new int[hs.size()];
        int ind=0;
        for(Object i : hs.toArray())  ans[ind++] = (int) i;
        return ans;
    }
    static int[] intersection(int[] arr1, int m, int[] arr2, int n){
        HashSet<Integer> hm = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<m;i++) hm.add(arr1[i]);
        for(int i=0;i<n;i++){
            if(!hm.add(arr2[i])) ar.add(arr2[i]);
        }
        int[] arr = new int[ar.size()];
        int ind=0;
        for(Object i: ar.toArray()) arr[ind++] = (int) i;
        return arr;
    }
}
