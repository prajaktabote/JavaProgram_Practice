class CursorDemo{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
      
        for(var x:al){
            System.out.println(x.getClass().getName());
        }
    }
}