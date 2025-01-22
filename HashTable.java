import java.util.*;
class HashTable{
    public static void main(String args[]){
        HashTable obj=new HashTable();
        obj.put("A",new Integer(3));
        obj.put("B",new Integer(2));
        obj.put("C",new Integer(8));
        obj.remove(new String("A"));
        System.out.print(obj);
    }
}