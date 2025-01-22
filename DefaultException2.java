class DefaultException2{
    void m1(){
        System.out.println(10/0);
        m2();
    }
    void m2(){
        System.out.println("In main");
    }
    public static void main(String args[]){
        System.out.println("Start main");
        DefaultException2 obj = new DefaultException2();
        obj.m1();
        System.out.println("End main");  
    }
}