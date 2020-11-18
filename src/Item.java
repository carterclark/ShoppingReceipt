import java.text.NumberFormat;

public abstract class Item {
	
	public static final double TAXRATE = 0.07525;
	
	private String name;
	private double price;
	private int qty;
	
	//static object for formatting output
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public Item(String name, double price, int qty){
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double calcTax() {
		return 0;
	}
	
	public String toString() {
		return 	name + "\t" +
				formatter.format(price) + "\t" + 
				qty + "\t" +
				formatter.format((price*qty)) + "\t";
	}
	
	

}
