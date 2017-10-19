import java.util.*;
// Palindrome!
class charnode{
    public static boolean palindrome(String arr){
        char [] list = arr.toCharArray();
        int mid = list.length/2, i=0,j=list.length-1;
        while(i<mid+1){
            if(list[j]!=list[i]) return false;
            i++;
            j--;
        }
        return true;
    }



    public static void main(String arr[]){
        String name="tumkmut";
         boolean test =  palindrome(name);
         System.out.println(test);

    }
    
}