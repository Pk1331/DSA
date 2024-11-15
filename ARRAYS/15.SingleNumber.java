//import java.util.HashMap;
class Main 
{
    /*public static int  CountOccurances(int[] arr)
    {
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key: arr)
        {
            if(map.containsKey(key))
            {
                map.put(key,(map.get(key)+1));
            }
            else map.put(key,1);
        }
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                res = entry.getKey();
            }
        }
        return res;
    }*/


    public static void main(String[] args) 
    {
        int arr[] = new int[]{4,1,2,1,2};
        int singlenum=0;
        for(int x:arr) singlenum^=x;
        System.out.println(singlenum);
        
    }
}