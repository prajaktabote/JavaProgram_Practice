class Demo5{
    public static void main(String args[]){
        int arr[]=new int[]{-6,-3,-10,0,2};
        int mul=0;
        int max=min_value;
        for(int i=0;i<arr.length;i++){
            mul=mul*arr[i];
            if(max<mul){
                max=mul;
            }
        }
        System.out.println(mul);
    }
}