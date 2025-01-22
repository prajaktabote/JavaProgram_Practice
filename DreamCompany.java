import java.util.Scanner;
class DreamCompany{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your dream comapny");
        String name=sc.next();
        System.out.println("Entetr your salary you want");
        Double salary=sc.nextDouble();
        System.out.println(name);
        System.out.println(salary);

    }
}