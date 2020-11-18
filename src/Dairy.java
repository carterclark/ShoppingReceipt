
public class Dairy extends GrocItem{
	
	private String expirationDate;
	
	public Dairy(String name, double price, int qty,
			String expirationDate) {
		super(name, price, qty, true);
		this.expirationDate = expirationDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String toString() {
		return super.toString()	+ "\t" + expirationDate;
	}

}
