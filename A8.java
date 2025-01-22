//a9 class madhe call
package com.pr;
import java.util.Scanner;

public class call{
public static void main(String args[])
{
    Operation op= new Operation ();
    Scanner sc=new Scanner(System.in);//taken user  value
    System.out.println("press1 for addition and  " + "2 for substration");
    int ch=sc.nextInt();
    System.out.println("Enter two number for operation");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    switch(ch)
    {
        case 1:
            op.add(num1, num2);
            break;

        case 2:
            op.sub(num1, num2);
            break;

    }
}

}