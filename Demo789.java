import java.util.*;
class Demo789{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size= sc.nextInt();
        int arr[]=new int[size];
        int count1=0;
        int count2=0;
        System.out.println("Enter element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
            count1++;
        }
        else{
            count2++;
        }
        }
        System.out.println(count1);
        System.out.println(count2);

    }
  
}