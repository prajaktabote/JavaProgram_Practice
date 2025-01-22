class Demo48{
    void fun(int x){
        System.out.println(x);
    }
    void fun(float y){
        System.out.println(y);
    }
    void fun(Demo obj){
        System.out.println("In demo para");
        System.out.println(obj);
    }
    public static void main(String args[]){
        Demo48 obj= new Demo48();
        obj.fun(10);
        obj.fun(18.5f);
        Demo48 obj1= new Demo48();
        obj1.fun(obj);
    }
}