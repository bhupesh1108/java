import java.util.HashMap;
import java.util.Map;

public class Frequency{
    public static void main(String[] args) {
        Integer [] arr={10,12,12,23,12,123,23,234,56,67,78,6,756,78,78,67,7,5,6};
        Map<Integer,Integer> hm=new HashMap<>();
        for(Integer a:arr){
            if(hm.containsKey(a)){
                int val=hm.get(a);
                hm.put(a, val+1);
            }
            else {
                hm.put(a, 1);
            }
        }

System.out.println(hm);    }
}