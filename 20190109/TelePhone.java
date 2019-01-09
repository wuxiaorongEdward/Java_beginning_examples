
class Phone {
	private String color;
	private String type;
	private int price;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}

class TelePhone {
	public static void main(String [] args) {
		Phone p = new Phone();
		p.setColor("black");
		p.setType("huawei");
		 System.out.println(p.getColor() + "***" + p.getType());
		 
		 String name = p.getType();
		 System.out.println(name);
	}
}