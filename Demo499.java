import java.io.*;
class Demo499{
    public static void main(String args[])throws IoException{
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter bollerName");
        String name1=br.readLine();
        System.out.println("Enter batsman");
        String name2=br.readLine();
        System.out.println(name1);
        System.out.println(name2);

    }
}