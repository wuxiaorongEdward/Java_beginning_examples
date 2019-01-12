class Outer {
	
	public void method() {
		int num = 20;
		
		class PartClass {
			public void show() {
				System.out.println(num);
			}
		}
		
		PartClass in = new PartClass();
		in.show();
	}
}
class PartialClassVar {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}