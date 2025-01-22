//Types of Innerclass:=
//Normal Inner class
//Method local inner class
//static Inner class
//Annonymous Inner class.
//-Normal
//-Parameterized annoymous inner class

//Normal Inner class:
class Outer{
    class Inner{

    void m1(){
        System.out.println("In m1-Inner");
    }

}
void m2(){
    System.out.println("In m2 Outer class");
}
}
class Client89{
    public static void main(String args[]){
        Outer obj=new Outer();
        obj.m2();
    }
}
