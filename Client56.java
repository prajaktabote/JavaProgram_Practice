import java.io.*;
import  java.net.*;
class Client56{
    public static void main(String args[])throws IoException{
        Socket s= new Socket("Localhost",1200);
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str;
        while(str=br.readLine()!=null){
            System.out.println(str);

        }
        br.close();
        s.close();

    }
}