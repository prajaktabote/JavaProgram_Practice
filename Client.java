class Apple
{
    Apple()
    {
        System.out.println("In Apple constructor");
    }
    void AppleProduct()
    {
        System.out.println("iphone , Mac, ipad");
    }
}
class iphone extends Apple{
    iphone()
    {
        System.out.println("In iphone constructor");
    }
    void models()
    {
        System.out.println("types of models");
    }
}
class Client 
    {
        public static void main(String args[])
        {
            Apple obj = new iphone();
            obj.AppleProduct();
          
           
        }
    }