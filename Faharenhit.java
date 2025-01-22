//how to convert fahrenhit to Celsius program in java

import java.util.*;
class Faharenhit
{
    public static void main(String args[])
    {
        float temp;
        Scanner sc= new Scanner(System.in);
    
        System.out.println("Enter a temp in Faharenhit");
        temp=sc.nextInt();

        temp = ((temp - 32)*5)/9;

        System.out.println("Temp in celsius = " +temp);

    }
}