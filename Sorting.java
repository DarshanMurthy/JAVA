import java.util.*;

public class Sorting{


    public static void main(String args[]){
        int arr[] = new int[] {1,2,3,3};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int target= 7;
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            int value = map.get(i);
            int offset= target-value;
        if(map.containsValue(offset)){
            System.out.println(map.get(i));
        }

        }
        


    
        }

}