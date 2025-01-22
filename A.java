public class A{
    public void add()
    {
        System.out.println("add");
        a.add();
        System.out.println();
    }
    public void sub()
    {
        A ab= new A();
        ab.add();
        System.out.println("sub");
    }
    public static void main(String args[])
    {
        A abc= new abc();
        abc.sub();
    } 
}