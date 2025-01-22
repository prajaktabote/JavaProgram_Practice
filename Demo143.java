class Demo143{
    public static void main(String args[]){
        System.out.println("Start main");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException obj){
            System.out.println("exception occured");
        }
        System.out.println("end main");
    }
}