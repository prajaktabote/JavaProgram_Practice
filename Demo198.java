class Demo198{
    void m1(){
        System.out.println(10/0);
        m2();
    }
    void m2(){
        System.out.println("In m2");
    }
    public static void main(String args[]){
        Demo198 obj=new Demo198();
        obj.m1();
        System.out.println("End main");
    }
}