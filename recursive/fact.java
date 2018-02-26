package recursive;

public class fact {
	public static void fact(int n) {
		if(n<=0) return;
		fact(n-1);
		fact(n-2);
		System.out.println(n);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	fact(4);

	}

}


