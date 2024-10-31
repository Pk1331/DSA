/*


import java.util.Arrays;
class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{99,56,74,11,83,143};
		int Sum = Arrays.stream(arr).sum();
		System.out.println("Sum of Elements in arr: "+Sum);
		
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
		System.out.println("Sum of Elements in arr: "+Sum);
		
	}
}