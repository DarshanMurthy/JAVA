
public class addtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first [] = {1,1,1};
		int second [] = {1,1,1};
		
		int third [] = new int[4];
		
		System.out.println(first[0] + second[0]);
		int carry=0;
		for(int i=0;i<3;i++) {
			third[i]=first[i] + second[i]+ carry;
			if(third[i]>9) {
				third[i] = third[i] % 10;
				carry=1;
			}
			else {
				carry=0;
			}
		}
		for(int j=0;j< third.length;j++) {
			System.out.println(third[j]);
		}
		
		
		

	}

}
