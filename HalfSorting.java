import java.util.*;
class HalfSorting{
    static void printOrder(int[] a, int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
               if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;

               }
            }
            for(int j=n/2;j<n-1;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,7,8,9,2};
        int n=arr.length;
        printOrder(arr,n);
    }

}