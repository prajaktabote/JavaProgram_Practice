class Demo{
    void marry(){
        System.out.println("Kirti Season");
    }
}
class Client85{
    public static void main(String args[]){
        Demo obj= new Demo(){
            void marry()
            {
                System.out.println("Dish pathani");
                fun();
            }
            void fun(){
                System.out.println("In fun");
            }
        };
        obj.marry();//It will give the child marry relationship method.
    }
}