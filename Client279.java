class Demo{
    void marry(){
        System.out.println("kirti sanon");
    }
}
class Client279{
    public static void main(String args[]){
        Demo obj=new Demo{
            void marry(){
                System.out.println("Disha patani");
                fun();
            }
          
        }
        obj.marry();
    }
}