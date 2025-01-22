//Advantage of finally in Exception Handling java program

//Case 2: When an exception occurr but not handled by the catch block
//Let's see the the fillowing example. Here, the code throws an exception however the catch block cannot handle it. Despite this, 
//the finally block is executed after the try block and then the program terminates abnormally.
class Allocate
{
    public static void main(String args[])
    {
        try
        {
            long date[]=new long[1000000000];
        }
        catch(Exception e){
            System.out.println("Finally block willl execute always");

        }
        finally{
            System.out.println("finally block will execute always.");
        }
    }
}