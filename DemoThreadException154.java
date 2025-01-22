class MyThread extends DemoThreadException154{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In run");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException){

            }
        }
    }
}
class DemoThreadException{
    public static void main(String args[])Throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        MyThread obj=new MyThread();
        obj.start();
        for(int i=0;i<10;i++){
            System.out.println("In main");
            Thread.sleep(1000);
    
        }

    }
}