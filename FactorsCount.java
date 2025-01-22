class FactorsCount{
    public static void main(String args[]){
        int n=9;
        int count=0;
        for(int i=1;i<=9;i++){
            if(n%i==0){
                count++;
            }
            System.out.println(count);
        }
    }
}