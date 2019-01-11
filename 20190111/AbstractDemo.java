abstract class Abstract {
	public abstract void method();
	
	public void show() {
		System.out.println("this is a abstract class");
	}
}

class AbstractDemo1 extends Abstract {
	/*public void method() {
		System.out.println("This is a abstracrt method");
	}*/
}

class AbstractDemo {
	public static void main(String[] args) {
		AbstractDemo1 ad = new AbstractDemo1();
		ad.method();
		ad.show();
		
	  //Abstract ad1 = new Abstract();   abstracrt class can not be a instance
	  Abstract ad1 = new AbstractDemo1();
		ad1.method();
		ad1.show();
	}
}