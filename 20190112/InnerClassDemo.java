class Outer {
	private int num = 10;
	
	private class Inner1 {
		public void show() {
			System.out.println("show");
		}
	}
	
	public static class Inner2 {
		public static void show1() {
			System.out.println("this is a static inner class");
		}
	}
	
	public void method() {
		Inner1 in1 = new Inner1();
		in1.show();
	}
}
class InnerClassDemo {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.method();
		
		Outer.Inner2 oi2 = new Outer.Inner2();
		oi2.show1();
		Outer.Inner2.show1();
	}
}