interface A{
    int x=10;
}
interface M{
    int x=20;
}
class child implements A,M{
int x=30;
void fun(){
    System.out.println(x);
}
}
class Client292{
    public static void main(String args[]){
        child obj=new child();
        obj.fun();
    }
}