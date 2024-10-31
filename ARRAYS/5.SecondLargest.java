/* 

import java.util.Arrays;
class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{84,65,17,11,78,74,145,143,789,26,1};
		int n=arr.length;
		Arrays.sort(arr);
		System.out.print("Second Largest Element is : "+arr[n-2]);
		
	}
}


*/
class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{84,65,17,11,78,74,143,789,26,1};
		int max = Integer.MIN_VALUE; int secondMax=Integer.MIN_VALUE;
		for(int num:arr)
		{
		    if(num>max)
		    {
		        secondMax=max;
		        max=num;
		    }
		    else if(num>secondMax && num!=max)  secondMax=num;
		}
		System.out.print(secondMax);
	}
}