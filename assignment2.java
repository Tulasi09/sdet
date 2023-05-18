package Array;

public class assignment2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,5,7};
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<min) {
				 min =arr[i];
			 }}
				 System.out.println("minimum value is"+ min);
				 
			 
			 
		 
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 } System.out.println("maximum value is"+ max);
			 
		 
		
		// TODO Auto-generated method stub

	}

}
