
class Rectangle {
	private int width;
	private int length;
	
	Rectangle() {}
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	} 
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	
	public int getZhouChang() {
		return (length + width) * 2;
	}
	public int getArea() {
		return length * width;
	}
}

class RectangleTest {
	public static void main(String[] args) {
		//reconstruction with no params
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setLength(20);
		
		System.out.println("Zhouchang : " + r1.getZhouChang());
		System.out.println("Area : " + r1.getArea());
		
		System.out.println("------------------------------------");
		
		//reconstruction with params
		Rectangle r2 = new Rectangle(20, 30);
		System.out.println("width : " + r2.getWidth());
		System.out.println("length: " + r2.getLength());
		System.out.println("Zhouchang : " + r2.getZhouChang());
		System.out.println("Area : " + r2.getArea());
		
	}
}