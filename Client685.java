class Demo{
    void fun(Object obj){
        System.out.println("Object");
    }
    void fun(String str){
        System.out.println("String");
    }
}
class Client685{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.fun("Core2web");
        obj.fun(new StringBuffer("Core2web"));
        obj.fun(null);
    }
}