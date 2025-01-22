class Demo594{
    public static void main(String args[]){
        Demo594 obj= new Demo594();
        obj.fun(10);
        obj.fun(10.5f);
    }
    void fun(int x){
        System.out.println("In fun");
        System.out.println(x);
    }
}