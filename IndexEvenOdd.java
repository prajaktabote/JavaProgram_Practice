public class IndexEvenOdd{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i=i+2){
             even=even+arr[i];
        }
        for(int i=1;i<arr.length;i=i+2){
            odd=odd+arr[i];
        }
        System.out.println(even-odd);
    }
}