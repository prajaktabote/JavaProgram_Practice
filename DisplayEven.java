public class DisplayEven{
    public static void main(String args[]){
        int number=100;
        System.out.println("List of even number of 1 to 100" +number+":");
        for(int i=1;i<=number;i++){
            if(i%2==0){
               System.out.print(i+ " ");
            }
        }
    }
}