//Write a function to print nth term of fibonaccie Series using Recursion
class FibonacieSeries780{

    static int fib(int n){
        if(n==1){
        return 0;
        }
        else if(n==2)
        {
             return 1;
 
         }
         else {
            return fib(n:n-1) +fib(n:n-2);
         }
    }
    public static void main(String args[]){
        int result = fib(n:7);
        System.out.println(result);
    }
}