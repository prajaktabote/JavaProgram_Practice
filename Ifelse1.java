import java.util.Scanner;
class Ifelse1
{
    public static void main(String args[])
    {
        int marksObtained, passingMarks;
        passingMarks =40;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input marks scored by you");

        marksObtained = sc.nextInt();

        if(marksObtained >= passingMarks)
        {
            System.out.println("you passed the exam.");
        }else
        {
            System.out.println("Unfortunately you failed to pass the exam.");
        }
    }
}