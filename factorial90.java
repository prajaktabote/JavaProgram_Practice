import java.util.Scanner;
class factorial90{
    public static void main(String args[]){
        int n=5,fact=1;
        
         Scanner sc=new Scanner(System.in);
        sc.nextInt();
     
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print(fact);
    }
}