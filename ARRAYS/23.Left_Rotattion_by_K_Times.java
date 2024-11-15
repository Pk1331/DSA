class Main
{
    public static void rotate(int[] arr,int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
	public static void main(String[] args) 
	{
		int arr[]= new int[]{1, 2, 3, 4, 5};
		for(int ele : arr) System.out.print(ele+" ");
		System.out.println(" ");
		int  k=3;
		int n = arr.length;
		k=k%n;
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		rotate(arr,0,n-1);
	    for(int ele : arr) System.out.print(ele+" ");
	}
}