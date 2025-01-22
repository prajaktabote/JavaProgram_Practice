//how to convert integer to string in java
public class Integer2
{
    public static void main(String args[])
    {
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//33 because+ is binary plus operator
        System.out.println(s+100);//200100 because concatenatio  operator
    }
}