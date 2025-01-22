class Demo173{
    int x=10;
    static int y=20;
    Demo173(){
        System.out.println("In constructor");
    }
    static{
        System.out.println("In static block1");
    }{
        System.out.println("Instance block1");
    }
    public static void main(String args[]){
        Demo173 obj= new Demo173();
    }
    static{
        System.out.println("In static block2");
    }
    {
        System.out.println("In instance block2");
    }
}