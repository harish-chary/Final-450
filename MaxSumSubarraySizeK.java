import java.util.*;
public class Temp {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 11, 8, 2};
        int sum=0, maxsum=0, window = 3, windStart=0, windEnd=0;
//        for(int i=0;i<window;i++)  sum+=arr[i];
//        int maxsum=sum;
//        while(windEnd<arr.length-1) {
//            System.out.println("Start: "+windStart+" End: "+windEnd);
//            sum=sum-arr[windStart++]+arr[++windEnd];
//            if(sum>maxsum) maxsum=sum;
//        }

        for(windEnd=0;windEnd<arr.length;windEnd++) {
            //System.out.println("Start: "+windStart+" End: "+windEnd);
            sum+=arr[windEnd];
            if(windEnd<window)  continue;
            sum -= arr[windStart++];
            System.out.println("Start: "+windStart+" End: "+windEnd+" Sum: "+sum);
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
