class CommonElementsInThreeSortedArrays
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int a=0, b=0, c=0;
        while(a<A.length && b<B.length && c<C.length) {
            if(A[a] == B[b] && A[a] == C[c] && !ans.contains(A[a])) {
                ans.add(A[a]);
                a++; b++; c++; continue;
            }
            int min = Math.min(Math.min(A[a],B[b]),C[c]);
            if(A[a]==min) a++;
            else if(B[b]==min) b++;
            else c++;
        }
        return ans;
    }
}

