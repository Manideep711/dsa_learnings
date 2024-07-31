import java.util.HashMap;
import java.util.Set;
import java.util.*;
public class max {
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,5,5,2,1,8,9,2,9};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element:arr){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }
            else{
                map.put(element,1);
            }
        }
        int maxno=-1;
        int maxfreq=0;
              Set<Map.Entry<Integer,Integer>> ma =map.entrySet();
              for(Map.Entry<Integer,Integer> num:ma){
                  if(num.getValue()>maxfreq){
                      maxfreq= num.getValue();
                      maxno= num.getKey();
                  }
              }
        System.out.println(maxno);
    }
}
