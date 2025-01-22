public class IndexOfExample
{
    public static void main(String args[])
    {
        String s1 = "this is index of example";
        int index1=s1.indexOf("of");//returns the index of is substring
        int index2=s1.indexOf("index");//return the index of  index substring
        System.out.println(index1+" "+index2);//2,8
        int index3=s1.indexOf("is",4);//returns the index of is substring after the 4th index 
        System.out.println(index3);// 5 i.e the index of another is
        int index4=s1.indexOf("s");// return the index of s char value

        System.out.println(index4);//3

    }
}