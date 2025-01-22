class parent{
    parent(){
        System.out.println("In parent constructor");
    }
    void parentproperty(){
        System.out.println("car,Gold,flat");
    }
}
class child extends parent{
    child(){
        System.out.println("In child constructor");
    }
}
class Client165{
    public static void main(String args[]){
        child obj=new child();
        obj.parentproperty();
    }
}