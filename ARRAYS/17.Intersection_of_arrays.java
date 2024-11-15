import java.util.Arrays;
import java.util.LinkedHashSet;
class Solution {
    public static int[] Intersection(int[] arr1,int[] arr2) 
    {
      LinkedHashSet<Integer> set = new LinkedHashSet<>();
      for(int x :arr1) set.add(x);
      LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
      for(int y: arr2)
      {
          if(set.contains(y)) set2.add(y);
      }
      int index=0;
      int[] arr = new int[set2.size()];
      for(int ele :set2) arr[index++]=ele;
      return arr;
    }
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{1,2,2,4};
        int[] arr2 = new int[]{2,2};
        System.out.print(Arrays.toString(Intersection(arr1,arr2)));
    }
}