/*
   use class to get the L and S fo rectangle
*/

class Rectangle {
	public int width;
	public int length;
	
	public int getL() {
		return ( width + length) * 2;
	}
	
	public int getS() {
		return width * length;
	}
}

class RectangleTest {
	public static void main(String [] args) {
		Rectangle rt = new Rectangle();
		rt.width = 10;
		rt.length = 20;
		
		System.out.println("L : " + rt.getL());
		System.out.println("S : " + rt.getS());
	}
}