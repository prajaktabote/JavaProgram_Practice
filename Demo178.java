class Demo178{
    int x=10;
    Demo178(){
        System.out.println("In constructor");
        System.out.println(this);
        System.out.println(this.x);
    }
    void fun(){
        System.out.println(this);
        System.out.println(x);
    }
    public static void main(String args[]){
        Demo178 obj= new Demo178();
        System.out.println(obj);
        obj.fun(); 
    }
}