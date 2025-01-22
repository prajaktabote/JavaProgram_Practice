//write a java program to find whether an array is sorted or not
class Array778{
    public static void main(String args[]){
        int arr[]={234,67,3,3546,78,12};
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isSorted = false;
                break;

            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");

        }
    }
}