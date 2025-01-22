//Take size of array from user and also element from user and print sum odd number
import java.io.*;
class Array7{
    public static void main(String[] m)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of Array");
        int size=  Integer .parseInt(br.readLine());

        int arr[]= new int[size];
        System.out.println("Enter Elements");

         int mult=1;

        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(i%2!=0){
               mult=mult*arr[i];
            }
            System.out.println("Enter multElement =" +mult);
        }



    }
}