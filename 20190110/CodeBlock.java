class Block {
	static {
		String name = "Edward";
		int age = 21;
		System.out.println("#1          codeblock");
	}
	{
		System.out.println("#2            This is a codeblock");
	}
	
	Block() {}
	Block(String name) {
		System.out.println("         You name is " + name);
	}
	
	public void show() {
		{
			System.out.println("#3            I am a codeblock of this method");
		}
		System.out.println("I finished, i am out");
	}
}

class CodeBlock {
	public static void main(String[] args) {
		Block b = new Block();
		b.show();
		//System.out.println(b.name);
		Block b1 = new Block("Edward");
		
		//System.out.println(Block.name);
	}
}