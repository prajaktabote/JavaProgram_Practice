class Demo{
    void fun(String str){
        System.out.println("String");
    }
    void fun(StringBuffer str1){
        System.out.println("StringBuffer");
    }
}
class Client684{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.fun("core2Web");
        obj.fun(new String("core2web")); 
        //obj.fun(null);
    }
}