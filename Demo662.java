import java.util.*;
class ResultException extends RuntimeException{
    ResultException(String msg){
        super(msg);
    }
}
class Demo662{
    public static void main(String args[]){
      int arr[]= new int[2];
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the mark");
      int mark= sc.nextInt();
      for(int i=0;i<arr.length;i++){
        if(mark<35){
            throw new ResultException("You are fail");
        }else{
          throw new ResultException("You are pass");
        }
      }

    }
    }

