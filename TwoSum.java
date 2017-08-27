import java.util.Arrays;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String args[]){
      int arr[] ={12,23,19,45,78,8,37,100,700};
      Arrays.sort(arr);
      int value [] =twoSum(arr,112);
      for(int i=0;i<value.length;i++){
          System.out.println(value[i]);
      }
    }
}