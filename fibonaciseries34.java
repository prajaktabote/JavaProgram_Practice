class fibonaciseries34{
    public static void main(String args[]){
        int i=0;
        int j=1;
        int sum=0;

        for(int y=0;y<=10;y++){
            System.out.println(sum);
            i=j;
            j=sum;
            sum=i+j;
        }
    }
}