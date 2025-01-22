abstract class SMastani{
    void quality(){
        System.out.println("Excellent");
    }
    abstract void price();
}
class Baramati extends SMastani{
    void price(){
        System.out.println("price of mastani");
    }

class Client300{
    public static void main(String args[]){
        SMastani obj=new Baramati();
        obj.quality();
        obj.price();

    }
}
}