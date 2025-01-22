class Instance1{
    int x=10;
    Instance1(){
        System.out.println("constructor");
    }{
        System.out.println("Instance block");
    }
    public static void main(String args[]){
        Instance1 obj= new Instance1();
        System.out.println("main");
        System.out.println("Instance Block2");

        
    }
}





















