class Demo{
    void fun(int x, float y){
        System.out.println("Int_float para");
    }
    void fun(float x, int y){
        System.out.println("float - int para");
    }
}
class Client683{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.fun(10,10f);
    }
}