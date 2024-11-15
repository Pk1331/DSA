import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public static Set<Integer> Union(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr1)
            set.add(x);
        for (int y : arr2)
            set.add(y);
        return set;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4 };
        int[] arr2 = new int[] { 3, 4, 5, 6 };
        Set<Integer> unionset = Union(arr1, arr2);
        System.out.print(unionset);
    }
}

/*

 * import java.util.LinkedHashSet;
 * import java.util.Set;
 * import java.util.Arrays;
 * class Solution {
 * public static int[] Union(int[] arr1,int[] arr2)
 * {
 * LinkedHashSet<Integer> set = new LinkedHashSet<>();
 * for(int x :arr1) set.add(x);
 * for(int y: arr2) set.add(y);
 * int index=0;
 * int[] arr = new int[set.size()];
 * for(int ele :set) arr[index++]=ele;
 * return arr;
 * }
 * public static void main(String[] args)
 * {
 * int[] arr1 = new int[]{1,2,3,4};
 * int[] arr2 = new int[]{3,4,5,6};
 * System.out.print(Arrays.toString(Union(arr1,arr2)));
 * }
 * }
 */