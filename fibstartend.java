import java.util.*;

public class fibstartend {
	private static int lo;
	private static int maxlen;
	public static String  testforuniqueString(String arr) {
		int len = arr.length();
		if(len < 2 ) return arr;
		
		for(int i=0;i< len-1;i++) {
			extendP(arr,i,i);
			extendP(arr,i,i+1);
		}

		return arr.substring(lo,lo+maxlen);
	}
	private static void extendP(String s, int j, int i) {
		while(j > =0 )
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr="darad";
		testforuniqueString(arr);

	}

}
