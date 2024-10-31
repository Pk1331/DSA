class Main
{
	public static void main(String[] args) 
	{
		int arr[]= new int[]{3, 7, 1, 2, 8, 4, 5};
		int n=arr.length+1;
		int total=n*(n+1)/2;
		int sum=0; 
		for(int num :arr) sum+=num;
		System.out.println("Missing Number is : "+(total-sum));
	    
	}
}