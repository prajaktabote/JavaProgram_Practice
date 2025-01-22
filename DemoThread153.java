 class MyThread extends DemoThread153{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In run");
        }
    }
}
class DemoThread153{
    public static void main(String args[]){
        MyThread obj=new MyThread();
        obj.run();
        for(int i=0;i<10;i++){
            System.out.println("In main");
        }
    }
}