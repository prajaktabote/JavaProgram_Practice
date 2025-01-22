class Demo593{
    public static void main(String args[]){
        Demo593 obj= new Demo593();
        obj.fun(10);
        obj.fun(10.5f);
        obj.fun('A');
     // obj.fun(true);

    }
    void fun(float x){
        System.out.println("In fun");
        System.out.println(x);
    }
}