/* 


class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{99,56,74,11,83,143};
		int min=arr[0];
		int max=arr[0];
		for(int num:arr)
		{
		    if(num>max) max=num;
		    if(num<min) min=num;
		}
		System.out.print("Minimum Element : "+min+" Maximum Element is : "+max);
		
	}
}


*/
import java.util.Arrays;
class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{99,56,74,11,83,143};
		int min=Arrays.stream(arr).min().orElseThrow();
		int max=Arrays.stream(arr).max().orElseThrow();
		System.out.println("Minimum Element : "+min);
		System.out.println("Maximum Element is : "+max);
		
	}
}