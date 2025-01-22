class Add3{
    int m,n,p;
    void input(int m,int n){
        this.m=m;
        this.n=n;
    }
    Calculate(){
        p=m+n;
        result p;
    }
    void show(){
        Calculate();
        System.out.println("The addition is:"+p);
    }
    public static void main(String args[]){
        Add3 A= new Add3();
        A.input(20,10);
        A.show();
    }
}