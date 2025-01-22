public class Array780{
    public static void main(String args[]){
        int arr[]={89,34,123,56,678,80};
        int max=0;

        for(int element:arr){
            if(max<element){
                max=element;
            }
        }
        System.out.println("The value of the maximum  is " +max);
        
    }
}