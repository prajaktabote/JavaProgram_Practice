import java.util.Scanner;
 class Largestnumber
 {
    public static void main(String args[])
    {
        int x,y,z;
        System.out.println("Enter three integeer number");
        Scanner sc=new Scanner(System.in);
         
         x=sc.nextInt();
         y=sc.nextInt();
         z=sc.nextInt();

         if(x > y && x > z)
         System.out.println("First number is largest");
         else if(y > x &&  y>z)
         {
            System.out.println("Second number is largest");

         }else if(z >x && z> y)
         {
            System.out.println("Third number is largest");
            
         }
         
         else{
            System.out.println("Entered number  are not distinct");
         }
    }
 }