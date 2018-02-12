package arrays;

public class rotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rotate[] = {1,2,3,4};
		int arr[] = new int[4];
		int counter=0;
		for(int i=2;i< rotate.length;i++) {
			arr[counter] = rotate[i];
			counter = counter+1;
		}
		
		for(int j=0;j<2;j++) {
			arr[counter] = rotate[j];
			counter = counter+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		

	}

}
