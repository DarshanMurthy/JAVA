import java.util.*;
public class RemoveRedundent{
    public static void main(String args[]){
        int arr[] ={ -9,-8,12,2,4,2};
        HashSet<Integer> set = new HashSet<>();
        final int len = arr.length;
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int[] whitelist = new int[set.size()];
        int i = 0;
        for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
            whitelist[i++] = it.next();
        }
        Arrays.sort(whitelist);
        for(int p=0;p<4;p++){
        System.out.println(whitelist[p]);
        }
       
    }
}