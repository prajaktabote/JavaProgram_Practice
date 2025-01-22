import java.util.Scanner;
class floyds
{
    public static void main(String args[])
    {
        int n,num=1,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of floyds triangle you want");
        n=sc.nextInt();
        System.out.println("floyd triangle = ");

        for(c=1 ;c<=n; c++)
        {
            for(d=1 ; d<=c; d++ )
            {
                System.out.println(num+ " ");
                num++;
            }
            System.out.println(); 
        }
    }
}

