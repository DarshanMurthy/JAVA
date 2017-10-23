import java.util.*;

class LPS{
    public static boolean check_palindrome(String args){
    	int i = 0;
    	int j= args.length()-1;
    	int mid = args.length()/2;
    	while(i<mid) {
    		if(args.charAt(i)!= args.charAt(j)) return false;
    		i++;
    		j--;
    	}   	
    	return true;
    	
    }


    public static void main(String args[]){
    String name = "Darshan Tumkur Sreenivas";
    for(int i=0;i< name.length();i++) {
    	for(int j=i+1;j<name.length();j++) {
    		boolean test = check_palindrome(name.substring(i,j));
    		if(test == true ) {
    			System.out.println(name.substring(i,j));
    		}
    		
    		
    	}
    }
    

    }
}