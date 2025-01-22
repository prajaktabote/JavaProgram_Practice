class Demo179{
    int x=10;
    Demo179(){
        System.out.println("In no-aru constructor");
    }
    Demo179(int x){
        System.out.println("In parameterized constructor");
    }
    public static void  main(String args[]){
        Demo179 obj1= new Demo179();
        Demo179 obj2= new Demo179(10);
    }
}