import java.util.*;
class IteratingOver{
    public static void main(String args[]){
        SortedMap sm=new TreeMap();
        sm.put("Ind","India");
        sm.put("pak","Pakistan");
        sm.put("Aas","Australica");
        sm.put("Ban","Bangladesh");
        sm.put("Sl","Shrilanka");
        System.out.println(sm);
        Set<Map.Entry>data=sm.entrySet();
        Iterator<Map.Entry>itr=data.Iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            Map.Entry abc=itr.next();
            System.out.println(abc.getKey()+":" +abc.getValues());
        }
    }
}