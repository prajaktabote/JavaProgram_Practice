import java.io.*;
class Demo138{
    public static void main(String arsg[])throws IoException{
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(System.in);
        System.out.println("Enter char");
        char ch=(char)br.readLine();
        System.out.println(ch);

    }
}