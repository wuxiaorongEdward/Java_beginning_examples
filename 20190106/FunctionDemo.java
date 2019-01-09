
class FunctionDemo {
	
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		int c = getSum(a, b);
		System.out.println(c);
	}
	public static int getSum(int a, int b){
		return a + b;
	}
}