class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,2,2,3,0,4,2};
        int ele=2;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ele) arr[index++]=arr[i];
        }
        System.out.println(index);
        for(int i=0;i<index;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}