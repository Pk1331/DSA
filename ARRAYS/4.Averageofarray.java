/*


import java.util.Arrays;
class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{1,2,3,4,5};
		int Sum = Arrays.stream(arr).sum();
		System.out.println("Average of Elements in arr: "+(Sum/arr.length));
		
	}
}


*/

class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{1,2,3,4,5};
		int Sum=0;
		for(int num:arr) Sum+=num;
		float average=Sum/(arr.length);
		System.out.println("Average of Elements in arr: "+average);
		
	}
}