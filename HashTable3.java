import java.util.*;
class HashTable3{
    public static void main(String args[]){
        HashTable3<Integer,String>ht=new HashTable<Integer,String>();
        ht.put(100,"Prajakta");
        ht.put(200,"Prajyot");
        ht.put(300,"Prajwal");
        ht.put(400,"Sayali");

        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getkey()+ " "+m.getValue());
        }
    }
}