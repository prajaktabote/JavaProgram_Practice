import java.util.*;
class AdultOrNot{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}