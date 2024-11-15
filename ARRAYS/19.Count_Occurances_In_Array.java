import java.util.HashMap;
class CountOccurances{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{1,2,3,2,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :arr)
        {
            if(map.containsKey(num)) map.put(num,(map.get(num)+1));
            else map.put(num,1);
        }
        System.out.println(map);
    }
}