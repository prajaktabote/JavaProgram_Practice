class Demo197{
    void m2(){
        System.out.println(10/0);
        System.out.println("In m2");
        System.out.println("EnD M2");
    }
void m1(){
    System.out.println("In m1");
    m2();
    System.out.println("end m1");
}
public static void main(String args[]){
    Demo197 obj=new Demo197();
    obj.m1();
    System.out.println("End main");
}
}
