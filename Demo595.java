class Demo595{
     void fun(int x){
        System.out.println(x);
   }
   public static void main(String args[]){
    System.out.println("In main");
    Demo595 obj=new Demo595();
    obj.fun();
    System.out.println("End main");

   }
}