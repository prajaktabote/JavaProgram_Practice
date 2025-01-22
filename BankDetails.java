import java.util.*;
class BankDetails
{

    private long AccBal;
    Private String accno;
    Private int IFSCODE;

    Scanner sc=new Scanner(System.in);

    public void openAccount()
    {
        
        System.out.println("Enter account balance ");
        AccBal=sc.nextInt();

        System.out.println("enter accno");
        accno=sc.nextLine();

        System.out.println("Enter IFSCODE");
        IFSCODE=sc.nextInt;


    }
    public void show()
    {
        System.out.println("account no"+ accno);
        System.out.println("account balance"+ AccBal);
        System.out.println("account rollno"+ rollno);
        System.out.println("IFSCOCDE"+ IFSCODE);


    }
    public void Deposite(
        {
            long amt;
            System.out.println("Enter amount you want to deposite");
            amt=sc.NextLong;

            balance= balance+amt;
        }

        public void withdraw()
        {
            long amt;
            System.out.println("Enter amount you want to withdraw");
            amt sc.NextLong();
            

            if(balance>=amt)
            {
                balance=balance-amt;
                System.out.println("Balance after withdraw" +balance);


            }else
            {
                System.out.println("Your balanv=ce is less than" + amt + "\Transaction is failed");
            }
        }
        public boolean search (String accno)
        {
            if(accno.equals(accno))
            {
                showAccount();

                return (true);
            }
        }
        public clsas BankingApp

    )
}