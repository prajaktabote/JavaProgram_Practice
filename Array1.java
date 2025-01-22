//Take size of array from user and also element  from user and print sum of odd element
import java.io.*;
class Array1
{
    public static void main(String[] m) throws IoException
    {
        BufferedReader br = new BufferedReader(new InputStream Reader (System.in));

        System.out.println("Enter size of array");
        int size= Integer.parseInt(br.readLine());

        int arr[] =new int[size];
        System.out.println("Enter elements");
        int add=0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= Integer.parseInt(br.readLine());
            if(arr[i]%2!=0)
            {
                add=add+arr[i];
            }
        }
        System.out.println("add of odd Element" +add);
    }
}