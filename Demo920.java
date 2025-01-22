class Demo920{
    void fun(int x){
        System.out.println(x);
    }
    void fun(float y){
        System.out.println(y);
    }
    void fun(Demo920 obj){
        System.out.println("In Demo para");
        System.out.println(obj);
    }
    public static void main(String args[]){
        Demo920 obj= new Demo920();
        obj.fun(10);
        obj.fun(10.7f);
        Demo920 obj1= new Demo920();
        obj1.fun(obj);
    }
}