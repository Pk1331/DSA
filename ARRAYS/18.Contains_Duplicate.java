import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          if(map.containsKey(nums[i])) return true;
          else map.put(nums[i],i);
       }
       return false;
    }
}
/*
 class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) return true;
        }
        return false;
    }
}
 */