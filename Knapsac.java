public class Knapsac{
    public static void main(String args[]){
        int MaxWeight=10;
        int [] weight={3,3,2,5,1};
        int [] profit={10,15,10,12,8};

        int pw[]=new int[weight.length];

        for(int i=0;i<weight.length;i++){
            pw[i]=profit[i]/weigth[i];
        }
        for(int i=0;i<pw.length-1;i++){
            for(int j=i+1;j<pw.length;j++){
                if(pw[i]>pw[j]){
                    int temp1=pw[i];
                    pw[i]=pw[j];
                    pw[j]=temp1;

                    int temp2=weight[i];
                    weigth[i]= weigth[j];
                    weigth[j]=temp2;

                    int temp3=profit[i];
                    profit[i]=profit[j];
                    profit[j]=temp3;
                }
            }
        }
        int weightSum=0;
        int profitSum=0;
        for(int i=pw.length-1;i>=0;i--){
            if(weightSum+weight[i]==MaxWeight){
                break;
            }
            else if(weightSum+weight[i]>=MaxWeight=MaxWeight){
                int req=MaxWeight-weightSum;
                int div=req/weigth[i];
                profitSum=div*profit[i];
                break;
            }
            System.out.println("MaxProfit:"+profitSum);
        }

    }
}