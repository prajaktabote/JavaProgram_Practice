class fibonaccierecursion{
    static int n1=0,n2=1,n3=0;
    static  void printfibonaccierecursion1(int count)
    {
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            
            System.out.print(" "+n3);
            printfibonaccierecursion1(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n1+ " "+n2);
        printfibonaccierecursion1(count-2);
    }
}