import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("man",3);
        map.put("na",2);
        map.put("sa",2);
        map.put("ba",2);
        map.get("ba");

        System.out.println(map.containsKey(""));
        System.out.println(map.get("sssas"));
        //to iterate in the map
        Set<Map.Entry<String, Integer>> set=map.entrySet();
        for(Map.Entry<String, Integer> elem:set){
            System.out.println(elem.getKey()+" has letters "+elem.getValue());
        }

        //set only contains key
    }
}