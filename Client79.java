import java.io.*;
class Fun1{
    void Fun1(Object obj){
        System.out.println("object");
    }
    void Fun1(String str){
        System.out.println("String ");

    }
}
class Client79{
    public static void main(String args[]){
        Fun1 obj = new Fun1();
        obj.Fun1("Core2web");
       
        obj.Fun1(null);
        obj.Fun1(new StringBuffer("Core2web"));
    }
}