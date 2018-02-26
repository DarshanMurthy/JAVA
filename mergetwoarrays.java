
public class mergetwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first[] = {1,2,3,4};
		int second[] = {4,5,6,7};
		int third[] = new int[first.length+ second.length];
		int f=0, s=0, t=0 ;
		
		for(int i=0;i< third.length;i++) {
			if(first[f] < second[s] && f < first.length) {
				third[i] = first[f];
				f++;
			}else {
				third[i] = second[s];
				s++;
			}
		}
		for(int i=0;i< third.length;i++) {
			System.out.println(third[i]);
		}
		
		

	}

}
