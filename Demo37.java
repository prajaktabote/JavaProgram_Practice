class Demo37
{
    public static void main(String args[])
    {
        String str1="Prajakta";
        String str2=new String("Bagal");
        StringBuffer str3 = new String("core2wb");
        String str4= str1.concat(str3);
        StringBuffer str5 = str3.append(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str5);
    }
}