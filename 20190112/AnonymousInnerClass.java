interface Game {
	public abstract void show();
}

class Outer {
	public void method() {
		new Game() {
			public void show() {
				System.out.println("show");
			}
		};
		
		Game game = new Game() {
			public void show() {
				System.out.println("show");
			}
		};
		game.show();
	}
}
class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}