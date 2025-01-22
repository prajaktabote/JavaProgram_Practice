class Ipl
{
    void matchInfo(String Team1, String Team2);
    System.out.println(Team1 + "VS" + Team2);
}
void matchInfo(String Team1, String Team2, String venue)
{
    System.out.println(Team1+ "vs" +Team2);
    System.out.println("venue=" +venue);
}
 class client
 {
    public static void main(String args[])
    {
        Ipl ipl2023 =new Ipl();
        ipl2023.matchInfo("GT" ,"CSK");
        ipl2023.matchInfo("GT", "CSK", "NMSA");
    }
 }