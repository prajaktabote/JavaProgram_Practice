class Demo172{
    int x=10;
    Demo172(){
        System.out.println("No argument constructor");
    }
    Demo172(int x){
        this();
        
        System.out.println("In para");
    }
    public static void main(String args[]){
        Demo172 obj=new Demo172(50);
    }
}