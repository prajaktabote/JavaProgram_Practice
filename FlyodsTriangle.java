import java.util.Scanner;
class FloydsTriangle
{
    public static void main(String[] args)
    {
        int n, num=1,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        n = sc.nextInt();
        System.out.println("Floyd triangle");

        for(c = 1; c<=n;c++){
            for(d = 1;d<=c;d++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}