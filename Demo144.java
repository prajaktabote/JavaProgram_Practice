class Demo144{
    void m1(){
        System.out.println("In m1");
    }
    void m2(){
        System.out.println("In m2");
    }
    public static void main(String args[]){
        Demo144 obj=new Demo144();
        obj.m1();
        obj=null;
        obj.m2();
        System.out.println("End main");
    }
}