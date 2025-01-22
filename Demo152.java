import java.util.Scanner;
class ResulDemoException extends RuntimeException{
    ResulDemoException(String msg){
        super(msg);
    }
}
class Demo152{
    public static void main(String args[]){
        int arr[]=new int[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        for(int i=0;i<arr.length;i++){
            int mark=sc.nextInt();
            if(mark<35)
            throw new ResulDemoException("you are fail");
            arr[i]=mark;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}