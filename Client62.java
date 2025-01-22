class parent{
    protected  void fun(){
        System.out.println("parent fun");

    }
}
class child extends parent{
   protected void fun(){
        System.out.println("Child fun");

    }

}
class Client62{
    public static void main(String args[]){
        parent p=new child();
        p.fun();
    }
}