class Match{
    void matchType(){
        System.out.println("Oneday | T20| Test");
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
class Client682{
    public static void main(String args[]){
        Match type1= new IPLMatch();
        type1.matchType();

        Match type2 = new TestMatch();
        type2.matchType();
    }
}