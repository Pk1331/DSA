/*

 Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

*/
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> res = new ArrayList<Integer>();
        int[] arr = new int[nums.length+1];
        for(int num : nums) arr[num]++;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0) res.add(i);
        }
        return res;
    }
}