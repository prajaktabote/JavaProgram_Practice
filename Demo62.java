import java.util.*;
class ResultException extends RuntimeException{
    ResultException(String msg){
        super(msg);
    }

}
class Demo62{
    public static void main(String args[])
    {
        int arr[]=new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
                int mark=sc.nextInt();

        for( int i=0;i<arr.length;i++){
       
        if(mark<35){
             arr[i]=mark;
            throw new ResultException("You are fail");
         
        }else{
            throw new ResultException("you are pass");
        }
        }
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
