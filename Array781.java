//write a java program to find the maximum element in array
public class Array781{
    public static void main(String args[]){
        int arr[]={89,56,34,12,788,32,23};
        int max=0;
        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println("the value of the maximum element in this array is:" +max);
    }
}