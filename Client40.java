class Demo
{
    int x =10;
    void marry()
    {
        System.out.println("kirti sanon");
    }
}
class Client40
{
    public static void main(String args[])
    {
        
        Demo obj =new Demo();
        {
            void marry()
            {
                System.out.println("Disha Patani");
            }
        }
        obj.marry();//it will give call to child marry method
    }
}