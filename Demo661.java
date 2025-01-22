class MyThreads extends Demo661{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In run");

        }
    }
}
class Demo661{
    public static void main(String args[]){
        MyThreads obj = new MyThreads();
        obj.run();
        for(int i=0;i<10;i++){
            System.out.println("In main");
        }
    }
}