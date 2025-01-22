import java.util.*;
import arithfun Addition;
class  Addition10{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Addition10 obj=new Addition10(x,y);
        System.out.println(obj.add());
    }
}