import java.util.Scanner;
class DataOverflowException extends RuntimeException{
    DataOverflowException(String msg){
        super(msg);
    }
}
class DataUnderflowException extends RuntimeException{
    DataUnderflowException(String msg){
        super(msg);
    }
}
class Demo150{
    public static void main(String args[]){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer number");
        System.out.println("note:0<element<100");
        for(int i=0;i<arr.length;i++){
            int data=sc.nextInt();
            if(data<0)
            throw new DataUnderflowException("less than 0");
            if(data>100)
            throw new DataOverflowException("grater than 100");
            arr[i]=data;
        }
    }
}