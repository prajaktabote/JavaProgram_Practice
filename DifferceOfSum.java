public class DifferenceOfSum{
    public static int differceOfSum(int m,int n){
        int sum=0;
        int sum1=0;
        
        for(int i=1;i<=m;i++){
            if(i%n !=0){
                sum +=i;
            }else{
                sum1 +=i;
            }

        }
        int difference=sum-sum1;
        return difference;
    }
    public static void main(String args[]){
        int n=4;
        int m=20;
        int result=differenceOfSum(n,m);
        System.out.println("output" +result);
    }
}