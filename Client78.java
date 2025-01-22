class Fun{
    void Fun(String str){
        System.out.println("String");
    }
    void Fun(StringBuffer str1){
        System.out.println("StringBuffer");
    }
   
}
class Client78{
    public static void main(String args[]){
        Fun obj = new Fun();
        obj.Fun("Core2web");
        obj.Fun(new StringBuffer("Core2web"));
           obj.Fun(null);
     }
}