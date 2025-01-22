import java.util.*;
class Addition{
    public static void main(String args[]){
        int n1,n2,sum;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter first number:");
       n1=sc.nextInt();
        System.out.print("Enter second number:");
       n2=sc.nextInt();
       sum=n1+n2;
       System.out.print("Summation is" +sum);
    }
}