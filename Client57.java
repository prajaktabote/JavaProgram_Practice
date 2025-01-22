class Demo{
    void Fun(Object obj){
        System.out.println("object");
    }
    void Fun(String str){
        System.out.println("String");
    }
}
class Client57{
    public static void main(String args[]){
        Demo obj= new Demo();
        obj.Fun("Core2Web");
        obj.Fun(new StringBuffer("Core2web"));
        obj.Fun(null);
    }
}