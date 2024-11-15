class Main 
{
    public static int StockPrice(int[] arr)
    {
        int maxprofit=0;
        int minstock=Integer.MAX_VALUE;
        for(int profit: arr)
        {
            minstock=Math.min(profit,minstock);
            maxprofit=Math.max(maxprofit,(profit-minstock));
        }
        return maxprofit;
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{7,6,4,3,1};
        System.out.println(StockPrice(arr));
    }
}