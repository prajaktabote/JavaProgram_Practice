class Demo
{
    void marry()
    {
        
        System.out.println("kirti sanon");

    }

}
class Client39
{
    public static void main(String args[])
    {
        Demo obj = new Demo(){
        
            void marry()
            {
                System.out.println("Disha patni");
                fun();
            }
            void fun(){
            System.out.println("In fun");
            }
        };
        obj.marry();
        
    }
   
    
}