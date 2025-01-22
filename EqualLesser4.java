import java.util.*;
class Equallesser4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a and b");
        int a = sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
}