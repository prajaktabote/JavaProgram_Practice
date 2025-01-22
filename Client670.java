class Demo{
    int x=10;
    static int y=20;
    class Innner{
        final static int a=30;
    }
}
class Client670{
    public static void main(String args[]){
        System.out.println(outer.y);
        outer obj = new outer();
        System.out.println(obj.x);

        System.out.println(obj.new Inner().a);
    }
}