import java.util.Scanner;
class AddTwoMatrix1
{
    public static void main(String args[])
    {

        int m,n,i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entered number of element rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();

        int first[][]=new int[m][n];
        int second[][]=new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the element of first matrix");

        for(i=0; i<m; i++)
        for(j=0;j<n; j++)
        first[i][j]=sc.nextInt();


        System.out.println("Enter the element of second matrix");

        for(i=0; i<m;i++)
        for(j=0; j<n;j++)
        second[i][j]=sc.nextInt();

        for(i=0; i<m;i++)
        for(j=0;j<n ;j++)
        sum[i][j]= first[i][j]+second[i][j];

        System.out.println("sum of entered metrices");
        for(i=0;i<m ;i++)
        {
            for(j=0; j<n; j++)
            System.out.print(sum[i][j]+ "\t");
            System.out.println();
        }
       

    }
}