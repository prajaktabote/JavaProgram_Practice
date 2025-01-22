import java.util.*;
class Faharenhitrepeat
{
   public static void main(String args[])
   {
    float temperature;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter temperature in faharenhit");
    temperature= sc.nextInt();

    temperature = ((temperature - 32)*5)/9;
    System.out.println("temparature in Celsious  "  +temperature);
   }
}