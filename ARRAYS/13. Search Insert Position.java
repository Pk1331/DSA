class Main 
{
    public static int Search_Position(int[] arr,int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=target) return i;
        }
        return n;
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{1,3,5,6};
        int target=7;
        System.out.println(Search_Position(arr,target));
    }
}