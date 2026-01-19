import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        // Map mp = new HashMap();
        // mp.put(10, "Xyz");
        // mp.put(12.5, false);
        // mp.put(null, null);
        // mp.put(true, 10);
        // mp.put('a', 'a');
        // mp.put("LPU", 100);
        // System.out.println(mp);

        // System.out.println(mp.remove(true));
        // System.out.println(mp.remove("Jalandhar"));

        // System.out.println(mp.containsKey(true));
        // System.out.println(mp.containsKey("LPU"));

        // System.out.println(mp.containsValue("Xyz"));
        // System.out.println(mp.containsValue(10));

        // System.out.println(mp.get(10));

        // Set entries = mp.entrySet();
        // System.out.println("Set: "+entries);

        // for(Object obj:entries) System.out.println(obj);

        // Set Keys = mp.keySet();
        // System.out.println("KEYS: "+Keys);

        // Iterator it = Keys.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // Q. WAJP to manage employee salary details using map. 1. add atleast 6 employee records       2. print only those employees whose salary is greater than 50000

        Map mp = new HashMap();   
        mp.put("Yash",100000);    
        mp.put("Avi",20000);    
        mp.put("Sky",30000);    
        mp.put("Ankit",4000);    
        mp.put("Sumit",50000);    
        mp.put("Hitarth",60000);

        Set Keys = mp.keySet();
        Iterator it = Keys.iterator();
        
        while (it.hasNext()) {
            Object a = it.next();
            if((Integer)mp.get(a)>50000){
                System.out.println(a);
            }
        }

    }
}
