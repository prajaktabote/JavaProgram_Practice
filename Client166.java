class Apple{
    Apple(){
        System.out.println("In apple constructor");
    }
    void AppleProduct(){
        System.out.println("iphone,Mac,ipad");
    }
}
class iphone extends Apple{
    iphone(){
        System.out.println("in product constructor");
    }
    void models(){
        System.out.println("types of models");
    }
}
class Client166{
    public static void main(String args[]){
        Apple obj = new iphone();
        obj.AppleProduct();
    }
}