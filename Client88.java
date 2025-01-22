//Local method Inner class
class Outer{
    void m1(){
        System.out.println("In m1 Outer");
    }
    static class Inner{
        void m1()
        {
            System.out.println("In m1 Inner class");
        }
    }
  
}
class Client88{
    public static void main(String args[]){

      Outer obj=new Outer();
      obj.m1();
    }
}