/*
     the use of array
	 int [] array = new int
*/

class ArrayDemo {
	public static void main(String [] args) {
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}