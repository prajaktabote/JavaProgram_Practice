import java.util.*;
class HashTable1{
    public static void main(String args[]){
        Hashtable ht=new Hashtable();
        ht.put(10,"Prajakta");
        ht.put(7,"Dattu");
        ht.put(18,"Virat");
        ht.put(1,"KLRohul");
        ht.put(45,"Rohit");
        System.out.print(ht);
        //keys
        Enumeration itr1=ht.keys();
        while(itr1.hasMoreElements()){
            System.out.println(itr1.nextElement());
        }
        //Element
        Enumeration itr2=ht.elements();
        while(itr2.hasMoreElements()){
        System.out.println(itr2.nextElement());
        }
        System.out.println(ht.get(10));
        ht.remove(1);
        System.out.println(ht);
    }
}