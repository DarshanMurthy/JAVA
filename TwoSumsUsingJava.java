import java.util.*;
public class TwoSumsUsingJava{

    public static void main(String args[]){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i< 100;i++){
            if(i%2==0){
                map.put(i,i+1);
            }
        }
        System.out.println(map);
        System.out.println(map.containsValue(19));
        System.out.println(map.containsKey(94));

        if(map.containsKey(94)){
            System.out.println(map.get(94));
        }
    }

}