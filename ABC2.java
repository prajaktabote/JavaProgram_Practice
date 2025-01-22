//abc class implementation interface runnable
class ABC2 implements Runnable
{
  public void run()
  {
    try
    {
        //moving thread t2 to the state timed waiting
        Thread.sleep(100);
    }
    catch(InterruptedException ie)
    {
        ie.printStackTrace();
    }
    System.out.printn("The state of thread t1 while it invoked the method join() on thread t2 "+ThreadState.t1.getState());
     //try-catch block
     try{
        Thread.sleep(200);
     }
     catch(InterruptedException ie)
     {
        ie.printStackTrace();
     }

  }
  //Thread state class implements the interface Runnable
  public class ThredState implements Runnable{
    public static Thread t1;
    public static ThreadState obj;

    //main method
    public static void main(String args[])
    {
        obj = new ThreadState();
        t1=new Thread(obj);

        //thread t1 is spawaned

      //the thread t1 is currently in the new state
      System.out.println("the state of thread t1 after spawning it -" +t1.getState());

      //invoking the start( ) method on the thread t1
      t1.start();
      System.out.println("the state of thread t1 after invoking the method start() on it-"+t1.getState());
   }
   public void run()
   {
    ABC2 myObj =new ABC2();
    Thread t2=new Thread(obj);

    System.out.println("The state of thread t2 after spawining it-" +t2.getState());
    t2.start();

    System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());  
  
  try  
{  
// moving the thread t1 to the state timed waiting   
Thread.sleep(200);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
  
System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );  
  
// try-catch block for the smooth flow of the  program  
try  
{  
// waiting for thread t2 to complete its execution  
t2.join();  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
   }
   
}  
  } 
