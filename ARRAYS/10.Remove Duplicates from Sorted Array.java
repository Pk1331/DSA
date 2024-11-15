import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(arr);
        int index=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println(index);
        for(int i=0;i<index;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}