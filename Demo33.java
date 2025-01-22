class Demo33
{
    public static void main(String args[])
    {
        int x=14;
        int y=16;
        int ans1=++x + x++;
        int ans2=--y + y--;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(x);
        System.out.println(y);
    }
}