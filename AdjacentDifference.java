public class AdjacentDifference{
    public static void main(String args[]){
        int arr[]={11,22,12,24,13,26,14};
        int pos=5;
        int sum=Math.abs(arr[pos]-arr[pos-1])+Math.abs(arr[pos]-arr[pos+1]);
        System.out.println(sum);
    }
}