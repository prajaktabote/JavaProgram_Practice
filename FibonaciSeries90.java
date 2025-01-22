class FibonaciSeries90{
    static int sum = 0;
    static void fibo(int n1){
        
        if(n1 == 0){
            return;
        }
        sum = sum + n1;
        n1--;
        fibo(n1);
    }
    public static void main(String[] args){
        fibo(10);
        System.out.println(sum);
    }
}