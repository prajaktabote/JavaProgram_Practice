import java.io.*;
class IoDemo{
    public static void main(String args[])throws IoException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
        System.out.println("Enter Building name");
        String name=br.readLine();

        System.out.println("Enter wing name");
        char wing=(char)br.readLine();

        System.out.println("Enter FlatNO");
        int FlatNO=integer.parseInt(br.readLine());

        System.out.println(name);
        System.out.println(wing);
        System.out.println(FlatNO);

    }
}