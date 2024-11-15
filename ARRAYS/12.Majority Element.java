class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,3};
        int majority=0;
        int score=0;
        for(int ele :arr)
        {
            if(score==0) majority=ele;
            if(majority==ele) score++;
            else score--;
        }
        System.out.println(majority);
    }
}