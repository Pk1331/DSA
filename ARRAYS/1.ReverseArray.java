class Main
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,3,4,5};
		int left =0;
		int right=arr.length-1;
		while(left<right)
		{
		    int temp=arr[left];
		    arr[left]=arr[right];
		    arr[right]=temp;
		    left++;
		    right--;
		}
		for(int ele :arr)
		{
		    System.out.print(ele+" ");
		}
	}
}