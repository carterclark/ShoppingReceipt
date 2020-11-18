
public class Housewares extends Item{
	
	private String material;
	
	public Housewares(String name, double price, int qty, 
			String material){
		super(name, price, qty);
		
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString() {
		return 	super.toString() + material;
	}
	
	public double calcTax() {
		return TAXRATE * super.getPrice()*super.getQty();
	}

}
