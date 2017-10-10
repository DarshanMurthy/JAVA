import java.util.*;

public class lengthOfLongestSubstring {


    static int leghtOfLongestSubStringTest(String string){
        char  charArray[]= string.toCharArray();
         ArrayList<ArrayList<Character>> listmain = new ArrayList<ArrayList<Character>>();


        for(int i=0;i<charArray.length;i++){
            ArrayList<Character> list = new ArrayList<Character>();
            list.add(charArray[i]);
            for(int j=i+1;j< charArray.length;j++){
                if(charArray[i] == charArray[j]) break;
                list.add(charArray[j]);
                
            }
            listmain.add(list);
        }

        System.out.println(listmain);

        return 100;
    }


    public static void main(String args[]){
       String name ="DarshanTumkur";
       leghtOfLongestSubStringTest(name);
       
    //    char [] listofcharacter= name.toCharArray();
    //    ArrayList<Character> list = new ArrayList<Character>();

    //    for(int i=0;i< listofcharacter.length;i++){  
    //        if(list.contains(listofcharacter[i])){
    //         continue;
    //        }else{
            
    //         list.add(listofcharacter[i]);

    //        }
        
    //    }







    }

}