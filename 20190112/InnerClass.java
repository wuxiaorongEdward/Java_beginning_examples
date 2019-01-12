class Outer {
	private int x = 20;
	
	class Inner {
		public void show() {
			System.out.println("Inner class");
		}
	}
	
	public void method() {
		Inner in = new Inner();
		in.show();
	}
}

class InnerClass {
	public static void main(String[] args) {
		
		//method 1 to create a inner class objuct
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		
		//using outer's method to use the inner method
		Outer o = new Outer();
		o.method();
	}
}