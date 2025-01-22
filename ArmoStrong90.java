
class ArmoStrong90{
    public static void main(String args[]){
        

        int n=153, length=0;

        int temp=n;
        while(temp!=0){
            temp=temp/10;
            length=length+1;
        }
        int temp1=n, rem, arm=0;
        while(temp1!=0)
        {
            rem= temp1%10;
            int mul=1;

            for(int i=1; i<=length;i++){
                mul=mul*rem;
            }
            arm= arm+mul;
            temp1=temp1/10;
        }
        if(n==arm){
            System.out.println("Number is armostrong");
        }else{
            System.out.println("Number is not armostrong");
        }

    }
}