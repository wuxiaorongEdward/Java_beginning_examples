// A simple constructor 

class Myclass {
	int x;
	Myclass(int i ) {
		x = i;
	}
}

class Constructor{
	public static void main(String [] args){
		Myclass t1 = new Myclass(10);
		Myclass t2 = new Myclass(88
		);
		
		System.out.println(t1.x + "  " + t2.x);
	}
}