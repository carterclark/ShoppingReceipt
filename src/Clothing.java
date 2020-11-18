
public class Clothing extends Item{

	private char size;
	private String color;
	
	public Clothing(String name, double price, int qty, 
			char size, String color) {
		
		super(name, price, qty);
		this.size = size;
		this.color = color;
	}
	
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return 	super.toString() + size + "\t" + color;
	}

}
