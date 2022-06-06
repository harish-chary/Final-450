static boolean SubArrayWithSumZero(int arr[],int n)
{
    // for(int i=0;i<n;i++) {
    //     int sum=0;
    //     for(int j=i;j<n;j++) {
    //         sum+=arr[j];
    //         if(sum==0) return true;
    //     }
    // }
    // return false;



    HashSet<Integer> hs = new HashSet<>(); int sum=0;
    for(int i=0;i<n;i++) {
        sum+=arr[i];
        if(arr[i]==0 || sum==0 || hs.contains(sum)) return true;
        hs.add(sum);
    }
    return false;
}
