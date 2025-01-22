class Demo582{
    public static void main(String args[]){
        Demo582 obj= new Demo582();
        int ret= obj.fun(10);
        System.out.println(ret);
    }
    int fun(int x){
        int val=x+50;
        return val;
    }
}