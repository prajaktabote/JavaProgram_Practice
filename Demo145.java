class Demo145{
    public static void main(String args[]){
        System.out.println("Start main");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException obj){
            System.out.println("exception occurd");
            //handling code
        }
        System.out.println("end main");
    }
}