class IPL{
    void matchInfo(String Team1,String Team2){
        System.out.println(Team1 + "vs" +Team2);
    }
    void matchInfo(String Team1,String Team2,String Venue){
        System.out.println(Team1+" vs "+Team2);
        System.out.println("Venue=" +Venue);
    }
}
class Client51{
    public static void main(String args[]){
        IPL ipl2023 = new IPL();
        ipl2023.matchInfo("gt","csk");
        ipl2023.matchInfo("gt","csk","NMSA");
    }
}