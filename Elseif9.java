import java.util.*;
class Elseif9{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a button");
        int Button=sc.nextInt();
        if(Button==1){
            System.out.println("HI");
        }
        else if(Button==2){
            System.out.println("Good Morning");
        }
        else if(Button==3){
            System.out.println("Good evening");
        }
        else{
            System.out.println("Invalid");
        }

    }
}