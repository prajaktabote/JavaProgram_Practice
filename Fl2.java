import java.util.Scanner;
class Fl2
{
    public static void main(String args[])
    {
        int n, num=1,c,d;
       
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number of floyds triangle you want");
        n=sc.nextInt();
        System.out.println("Floyds triangle:-");
        for(c=1 ; c<=n; c++)
        {
            for(d=1; d<=c; d++)
            {
                System.out.println(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}