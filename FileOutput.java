import java.FileOutputStream;
public class FileOutputStream{
    public static void main(String args[])
    {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testtout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success..by technolamror.");

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}