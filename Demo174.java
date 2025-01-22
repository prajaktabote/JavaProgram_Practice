class Demo174{
    int x=10;
    Demo174(){
        System.out.println("In constructor");
    }
    void fun(){
        System.out.println(x);
    }
    public static void main(String args[]){
        Demo174 obj=new Demo174();
        obj.fun();
    }
}