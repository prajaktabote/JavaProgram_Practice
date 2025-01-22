class Demo142{
    public static void main(String args[]){
        void m1(){

        }
        void m2(){

        }
        Demo142 obj=new Demo142();
        obj.m1();
        obj=null;
        obj.m2();
        try{
        obj.m2();
        }catch(NullPointerException obj){
            System.out.println("Here");
        }finally{
            System.out.println("Connection close");
        }
        System.out.println("end main");


    }
}