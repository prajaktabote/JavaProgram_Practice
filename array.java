import java.io.*;
class demo{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 1st Array size : ");
        int n1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[n1];
        System.out.println("Enter 1st Array element : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(" 2nd Array size : ");
        int n2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[n2];
        System.out.println("Enter 2nd Array element : ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int n = n1 +n2;
        int arr[] = new int[n];
        for(int i=0;i<n1;i++){
            arr[i] = arr1[i];

        }
        for(int i=0;i<n2;i++){
            arr[i+n1] = arr2[i];
            
        }
        System.out.println("3rd array : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }

    }
}