import java.util.*;
class IfElse9{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a button");
        int button= sc.nextInt();
        if(button==1){
            System.out.println("Hi");
        }
        else if(button==2){
            System.out.println("Good morning");
        }
        else if(button==3){
            System.out.println("Good evening");
        }
        else{
            System.out.println("Invalid Button");
        }

    }
}