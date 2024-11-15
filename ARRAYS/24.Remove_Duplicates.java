import java.util.LinkedHashSet;
class Main {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int ele : set) result[i++] = ele;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5, 3};
        
        int[] result = removeDuplicates(arr);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
