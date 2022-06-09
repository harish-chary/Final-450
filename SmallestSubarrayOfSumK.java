int arr[] = {2,1,5,2,3,2}, targetsum=7, currsum=0, windowStart=0, windowEnd=0, min=Integer.MAX_VALUE;
        for(windowEnd=0;windowEnd<arr.length;windowEnd++) {
            currsum+=arr[windowEnd];
            while(currsum>=targetsum) {
                min = Math.min(min,windowEnd-windowStart+1);
                currsum-=arr[windowStart++];
            }
        }
        System.out.println(min);
