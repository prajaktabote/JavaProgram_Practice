import java.io.*;
class IoException1{
    void getData() throws IoException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data=Integer.parseInt(br.readline);
        System.out.println(data);
        
    }
    public static void main(String args[]) throws IoException1{
        IoException1 obj= new IoException1();
        obj.getData();
    }


}