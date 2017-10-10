import java.util.*;

class TwoSum{
    static void TwoSum(int arr[], int target){
        for(int i=0;i<5;i++){
            int temp = target-arr[i];
            for(int j=i+1;j<5;j++){
                if(temp == arr[j]){
                    System.out.println(temp);
                    System.out.println(arr[i]);
                    break;
                    
                }
                
            

            }

        }
       

    }

    public static void main(String args[]){
       
     
        int arr[] = {1,2,3,7,5};
        int target=5;
     TwoSum(arr, target);
        


        // List<Integer> intr = new ArrayList<Integer>();
        // for(int i=0;i<100;i++){
        //     intr.add(i);
        // }
        // System.out.print(intr);



      
    }
}