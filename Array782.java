public class Array782{
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){

            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
            }
        for(int element: arr){
            System.out.println(element);
        }
    }
}