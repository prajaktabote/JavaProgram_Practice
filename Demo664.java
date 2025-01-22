class Demo664{
    public static void main(String args[]){
        void m1(){
            
        }
        void m2(){

        }
        Demo664 obj=new Demo664(){
            obj.m1();
            obj.null();
            try{
                obj.m2();
                
            }catch(Null pointerException obj S ){
                System.out.println("Here");
            }finally{
                System.out.println("Connection close");
            }
            System.out.println("end main");
        }
    }
}