class Outer{
    class Inner{
        void m1(){
            System.out.println("M1-Inner");
        }
    }
    void m2(){
        System.out.println("M2-outer");
    }
    class Client696{
      
    public static void main(String args[]){
        Inner obj = new Outer().new Inner();
        obj.m1();
     }
   }
 }














































  







