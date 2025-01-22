import java.util.*;
class HashDemo{
    public static void main(String args[]){
        HashMap hm= new HashMap();
        hm.put("java:",".java");
        hm.put("Python:", ".py");
        hm.put("Dart",".dare");
        System.out.println(hm);
        System.out.println(hm.get("Python"));
        System.out.println(hm.keyset());
        System.out.println(hm.values());
        System.out.println(hm.entryset());
    }
}