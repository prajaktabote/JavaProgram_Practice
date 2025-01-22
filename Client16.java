class Match 
{
    void matchType()
    {
      
      System.out.println("T20/ Oneday/Test");
    }
}
class IplMatch extends Match
{
    void matchType()
    {
        System.out.println("T20");
    }
}
class TestMatch extends Match
{
    void matchType()
    {
        System.out.println("Test");
        
    }

}
class Client16
{
    public static void main(String args[])
    {
        Match obj = new Match();
        obj.matchType();

        Match Type1 = new IplMatch();
        Type1.matchType();

        Match Type2= new TestMatch();
        Type2.matchType();

    }
}

