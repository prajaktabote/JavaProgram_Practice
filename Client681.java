class IPL{
    void matchInfo(String team1, String team2){
        System.out.println(team1 + "vs" +team2);
    }
    void matchInfo(String team1, String team2, String Venue){
        System.out.println(team1 + "vs" +team2);
        System.out.println("venue=" +Venue);
    }
}
class Client681{
    public static void main(String args[]){
        IPL obj= new IPL();
        obj.matchInfo("GT" , "CSK");
        obj.matchInfo("GT", "CSK", "NASA");
    }
}
