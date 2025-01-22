class Demo extends Demo667{
    public void run(){
        System.out.println("Demo:" +Demo667.currentThread().getName());
        
    }
}
class MyThreads extends Demo665{
    public void run(){
        System.out.println("MyThreads:" + Thread.currentThread.getName());
        Demo667 obj = new Demo667();
        obj.start();
    }
}
class Demo667{
    public static void main(String args[]){
        System.out.println("Thread:" +Thread.currentThread().getName());
        MyThreads obj1= new MyThreads();
        obj1.start();
    }
}