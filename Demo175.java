class Demo175{
    int x=10;
    Demo175(){
        System.out.println("In constructor");
        System.out.println(this);
        System.out.println(this.x);
    }
    void fun()
    {
        System.out.println(this);
        System.out.println(x);
    }
    public static void main(String args[]){
        Demo175 obj=new Demo175();
        System.out.println(obj);
        obj.fun();
    }
}