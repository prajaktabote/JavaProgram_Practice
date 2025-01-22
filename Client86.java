class Demo{
    int x=10;
    static int y=20;
    class Inner{
        final static int a=30;//try using static it is called as neasted class

    }
}
class Client86{
    public static void main(String args[]){
        System.out.println(Outer.y);
        Outer obj= new Outer();
        System.out.println(obj.x);
       // Outer.Inner obj1=obj.newInner();
        System.out.println(obj.y);

        
    }
}