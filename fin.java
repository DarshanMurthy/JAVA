import java.util.*;

public class fin{


    public static void main(String args []){

        Scanner iter = new Scanner(System.in);
   
        

       
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] = {1,-9, -9 ,-9,18,18,17};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                   map.put(j,arr[j]);
                   map.put(i,arr[i]);
                }
            }
        }
       



    }
}