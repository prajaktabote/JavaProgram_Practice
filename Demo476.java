import java.io.*;
class Demo499{
    public static void main(String args[])throws IoException{
        BufferedReader  br=new BufferedReader(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);

        System.out.println("Enter bollerName");
        String name1=br.readline();
        System.out.println("Enter batsman");
        String name2=br.readline();
        System.out.println(name1);
        System.out.println(name2);

    }
}