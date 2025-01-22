class Demo396
{
    int x=10;
    static int y=20;
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        Demo396 obj= new Demo396();
        obj.fun();
        //System.out.println(x);
        System.out.println(y);
    }

}