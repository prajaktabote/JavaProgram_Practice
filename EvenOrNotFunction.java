import java.util.*;
class EvenOrNotFunction{
    public static int pritnEven(int n){
        if(n%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
           
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            printEven(n);
        }
    }
}