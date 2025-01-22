class Demo132{
    int a,b;
    Demo132(int a, intb){
        this.a=a;
        this.b=b;
        void show(){
            println(a,b);
        }
        public static void main(String args[])
        {
            Demo132 d = new Demo132(10,20);
            d.show();
        }
    }
}