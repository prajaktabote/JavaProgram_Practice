//write a program sum even no and multiplication odd number
class Demo11
{
    public static void main(String args[]){
        int n=942111423;
        int i=0;
        int add=0;
        int mult=1;

        while(n!=0)
        {
            i=n%10;
            if(i%2==0)
            {
                add=add+i;

            }else(i%2==1)
            {
                mult=mult*1;
            }n=n/10;
            i++;
        }
        
    }
}