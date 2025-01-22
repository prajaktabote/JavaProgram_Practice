import java.io.*;
class Demo587{

    public static void main(String args[])throws IoException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Element");
        int arr[]=new int[5];
        int sum=0;
        for(int x=0;x<5;x++){
            arr[x]=Integer.parseInt(br.readline());
            sum=sum+arr[x];
            for(int i=0;i<5;i++){
                System.out.println(sum);
            }
        }
    }
}