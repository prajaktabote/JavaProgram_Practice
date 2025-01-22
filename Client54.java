class Match{
    void matchType(){
        System.out.println("T20/OneDay/Test");
    }
}
class IPLMatch extends Match{
    void matchType(){
        System.out.println("T20");
    }
}
class TestMatch extends Match{
    void matchType(){
        System.out.println("Test");
    }
}
class Client54{
    public static void main(String args[]){
        Match obj= new Match();
        obj.matchType();
        
        Match Type1=new IPLMatch();
        Type1.matchType();

        Match Type2=new TestMatch();
        Type2.matchType();
    }
}