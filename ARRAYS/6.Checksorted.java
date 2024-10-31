class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{84,65,17,11,78,74,143,789,26,1};
	    int arr2[] = new int[]{1,2,3,5,4,6};
	    int n=arr2.length;
	    boolean res=true;
	    for(int i=1;i<n;i++)
	    {
	        if(arr2[i]<arr2[i-1]) res=false;
	    }
	    if(res) System.out.print("Array is Sorted");
	    else  System.out.print("Array is not Sorted..");
        System.out.println(arr); // fun remove this not useful
	}
}