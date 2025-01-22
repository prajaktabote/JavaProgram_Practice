interface Demo{
    void gun();
  
        default void fun()
        {
            System.out.println("In fun demo");
        }
    }

    class DemoChild implements Demo
    {
        public void gun()
        {
            System.out.println("In gun-Demo child");
        }
    }
class Client31
{
    public static void main(String args[])
    {
        Demo obj = new DemoChild();
        obj.gun();
        obj.fun();
    }
}