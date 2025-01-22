import java.io.*;
class IoException4{
    public static void main(String args[]) throws IoException4{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);
    }
}