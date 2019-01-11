interface Game {
	public static final int x = 20;
	public abstract void playGame();
}

class Psp implements Game {
	public void playGame() {
		System.out.println("pSp is used to play game");
	}
    public void showNum() {
	    System.out.println(x);
    }
}

class InterfaceDemo {
	public static void main(String[] args) {
		Game psp = new Psp();
		psp.playGame();
		
		Psp p = (Psp) psp;
		p.showNum();
	}
}