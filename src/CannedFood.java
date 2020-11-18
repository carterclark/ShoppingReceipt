
public class CannedFood extends GrocItem{
	
	private int size;
	
	public CannedFood(String name, double price, int qty, boolean perishable,
			int size) {
		super(name, price, qty, perishable);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return super.toString() + "\t" + size;
	}
}
