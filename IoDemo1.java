import java.io.*;
class IoDemo{
    public static void main(String args[])throws IoException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        System.out.println("String1 =" +str1);
        br.close();
        char ch=(char)br.readLine();
        System.out.println("char=" =ch);
    }
    }