class Solution {
    public static void main(String[] args) 
    {
        int[] arr1 =new int[]{1,2,3,4,5};
        System.out.println("Array1: ");
        for(int ele :arr1) System.out.print(ele+" ");
        int[] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++) arr2[i]=arr1[i];
        for(int ele :arr2) System.out.print(ele+" ");
        
    }
}