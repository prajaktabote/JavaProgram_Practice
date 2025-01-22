class parent{
    int x=10;
    static int y=20;
    parent(){
        System.out.println("Parent");
    }
}
    class child extends parent{
        int x=100;
        static int y=200;
        child(){
            System.out.println("child");
        }
        void access(){
            System.out.println(super.x);
            System.out.print(super.y);
            System.out.println(x);
            System.out.println(y);
        }
    }
    class Client60{
        public static void main(String args[]){
            child obj=new child();
            obj.access();
        }
    }
