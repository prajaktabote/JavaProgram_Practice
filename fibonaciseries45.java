class fibonaciseries45{
    public static void main(String args[]){
        int i=0;
        int j=1;
        int sum=0;

        for(int x=0;x<=9;x++){
            System.out.println(sum);
            i=j;
            j=sum;
            sum=i+j;
            
        }
    }
}