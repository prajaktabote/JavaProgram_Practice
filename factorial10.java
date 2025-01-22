class factorial10{
    public static void main(String args[])
    {
        int n=9;
        int fact=1;
        while(n!=0)
        {
            fact=n*fact;
            n--;
        }
        System.out.println("fact" +fact);
    }
}