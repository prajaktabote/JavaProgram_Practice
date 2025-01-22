class Demo397
{
    int x=20;
    static int y=20;
    void fun(){
        System.out.println("In fun method");
    }
    static void Run(){
        System.out.println("In run method");
    }
    public static void main(String args[]){
        Demo397 obj=new Demo397();
       // System.out.println(x);
        System.out.println(y);
        obj.fun();
        obj.Run();
    }
   }
