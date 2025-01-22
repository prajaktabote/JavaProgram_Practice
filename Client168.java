class parent{
    static{
        System.out.println("In parent static block");
    }
}
class child extends parent{
    static{
        System.out.println("in child static block");
    }
}
class Client168{
    public static void main(String args[]){
        child obj= new child();
    }
}