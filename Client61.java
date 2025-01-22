class Demo{
    void Fun(String str){
        System.out.println("String");
    }
    void Fun(StringBuffer str1){
        System.out.println("StringBuffer");
    }
}
class Client61{
    public static void main(String args[]){
        Demo obj=new Demo();
        obj.Fun("Core2WEb");
        obj.Fun(new StringBuffer("core2web"));
        obj.Fun(null);
    }
}