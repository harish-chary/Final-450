int rowWithMax1s(int arr[][], int n, int m) {
	    int maxsum=-1,row=-1;
	    for(int i=0;i<n;i++) {
	        int sum=-1;
	        for(int j=0;j<m;j++) sum+=arr[i][j];
	        if(sum==m) return i;
	        if(sum>maxsum) {
	            maxsum=sum;
	            row=i;
	        }
	    }
	    return row;
    }
