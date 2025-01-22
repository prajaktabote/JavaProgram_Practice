class MyThreads extends Demo660{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("In run");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException){

            }
        }
    }
}
class Demo660{
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        obj.run();
        for(int i=0;i<10;i++){
            System.out.println("In main");
            Thread.sleep(1000);
        }
    }
}