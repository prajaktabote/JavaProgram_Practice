import java.util.*;
public class Curtain{
    public static void main(String args[])
    {
        int sum=0;
        int arr[]={3,42,60,6,14};
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i]/12;

        }
        System.out.println(sum);
    }
}