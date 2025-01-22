public class Array779{
    public static void main(String args[]){
        int arr[]={90,4,2,67,89,23,5};
        int min=Integer.MAX_VALUE;

        for(int element: arr){
            if(element<min){
                element=min;
            }
        }
        System.out.println(min);
    }
}