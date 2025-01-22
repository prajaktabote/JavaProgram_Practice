class Demo{
    void marry(){
        System.out.println("kirti sonon");
    }
}
class Client672{
    public static void main(String args[]){
        Demo obj = new Demo(){
            void marry(){
                System.out.println("Disha Pathani");
                fun();
            }
            void fun(){
                System.out.println("In fun");
            }
        }
        obj.marry();
        
    }
}