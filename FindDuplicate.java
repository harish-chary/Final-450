import java.util.*;
class FindDuplicate {
  Scanner sc = new Scanner(System.in);
  int[] nums = new int[sc.nextInt()];
  for(int i=0;i<nums.length;i++)  nums[i]=sc.nextInt();
  System.out.println(findDuplicate(nums));
  public int findDuplicate(int[] nums) {
      // int n = nums.length-1;
      // HashSet<Integer> hs = new HashSet<>(nums.length-2);
      // for(int i=0;i<nums.length;i++){
      //     if(!hs.add(nums[i])) return nums[i];
      // }
      // return nums[0];

      boolean[] arr = new boolean[nums.length];
      for(int i=0;i<nums.length;i++){
          if(arr[nums[i]]) return nums[i];
          arr[nums[i]] = true;
      }
      return 0;
        
    }
}
