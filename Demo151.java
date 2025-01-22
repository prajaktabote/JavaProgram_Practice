import java.util.Scanner;
class ResultDemoException extends RuntimeException{
    ResultDemoException(String msg){
        super(msg);
    }
}
class Demo151{
    public static void main(String args[]){
        int arr[]=new int[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        for(int i=0;i<arr.length;i++){
            int mark=sc.nextInt();
            if(mark<35)
            throw new ResultDemoException("you are fail");
            arr[i]=mark;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}