import java.util.Scanner;
class DreamComponet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Dream Company");
        String name= sc.next();
        System.out.println("Enter your salary what you want");
        double salary=sc.nextDouble();
        System.out.println(name);
        System.out.println(salary);
    }
}