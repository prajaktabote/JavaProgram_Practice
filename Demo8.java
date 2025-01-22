class Demo8{
    public static void main(String args[]){
        int[] arr=new int[]{1,3,5,5,5,5,6,123,125};
        int x=5;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr(i)==x){
                index=i;
                count++;
            }
        }
        System.out.println(index);
        System.out.println(count+index-1);
    }
}