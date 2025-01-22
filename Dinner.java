import java.util.*;

class HTM
{
int ch1,ch2,ch21,ch22,ch3,cno,roomno;
String namec,yn1,yn2,yn3;
}



//////////////////////////////////////////////////////////////////////////////////
class Dinner extends HTM
{
     Scanner s1 = new Scanner(System.in);

     void menu()
     {

      System.out.println("\n");
      System.out.println("welcome to our Hotel");
      System.out.println("1.Menu-card ");
      System.out.println("2.Room Booking Ac/Non Ac");
      System.out.println("3.Table Booking for Dinner");  
      System.out.println("4.Order");        
      System.out.println("5.Exit ");
        
                                       System.out.println("Enter the choice :");
                                       ch1 = s1.nextInt();


                   switch(ch1)
                                            {
                                                case 1 :  
                                                         Menucard();  
                                                         
                                               case 2 : 
                                                         roombooking();                        
                                                          break;
                                                                                                                                           
                                              

                                                 case 3 : break;

                                                 default:
                                                 System.out.println("please Enter valid no.");

                                    

                                             }  

      }

      void Menucard()
      {
      	 try
            {