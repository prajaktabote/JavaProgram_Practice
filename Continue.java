class Continue{
    public static void main(String args[]){
        int n =50;
        for(int i=0;i<=50;i++){
            if(i%3==0 && i%5==0 || i%4==0){
                continue;
            }
            System.out.println(i);
        }
    }
}