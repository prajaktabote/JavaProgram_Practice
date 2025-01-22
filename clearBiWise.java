class clearBiWise{
    public static void main(String args[]){
        int n=9;
        int pos=1;

        int bitmask=1<<pos;
        int notBitMask=~(bitmask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}