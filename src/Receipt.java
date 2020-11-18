import java.text.DecimalFormat;

/**
 * 
 * @author Carter Clark
 *
 * Invariants for this class:
 *
 * The number of items contained in the array is stored in 
 * an instance variable called numPurchases.
 *
 * The Item entries are stored in an instance array variable
 * called purchases, from postion purchases[0] to position
 * purchases[numPurchases-1].
 * 
 */

public class Receipt {
	private Item[] purchases;
	private int numPurchases;
	
	private static DecimalFormat df2 = new DecimalFormat("$###,###.##");
	
	public Receipt(int capacity){
		purchases = new Item[capacity];
	}
	
	public void add(Item itm) {
		if(numPurchases <= purchases.length) {
			purchases[numPurchases++] = itm;
		}
	}
	
	public double totalBeforeTax() {
		
		double total = 0;
		
		for(int i=0; i<numPurchases; i++) {
			total += purchases[i].getPrice() * purchases[i].getQty();
		}
		
		return total;
	}
	
	public double totalTax() {
		
		double total = 0;
		
		for(int i=0; i<numPurchases; i++) {
			total += purchases[i].calcTax();
		}
		
		return total;
	}
	
	public String toString() {
		String str = "";
		int count = 0;
		
		//for loop for clothing
		str += "\nCLOTHING\n";
		for(int i=0; i<numPurchases; i++) {
			if(purchases[i] instanceof Clothing) {
				str += purchases[i] + "\n";
			}
			count += purchases[i].getQty();//for number of items
		}
		//for loop for housewares
		str += "\nHOUSEWARES\n";
		for(int i=0; i<numPurchases; i++) {
			if(purchases[i] instanceof Housewares) {
				str += purchases[i] + "\n";;
			}
		}
		//for loop for grocitem
		str += "\nGROCERY ITEMS\n";
		for(int i=0; i<numPurchases; i++) {
			if(purchases[i] instanceof GrocItem 
					&& !(purchases[i] instanceof Dairy)
					&& !(purchases[i] instanceof CannedFood)) {
				str += purchases[i] + "\n";;
			}
		}
		//for loop for dairy
		str += "\nDAIRY\n";
		for(int i=0; i<numPurchases; i++) {
			if(purchases[i] instanceof Dairy) {
				str += purchases[i] + "\n";;
			}
		}
		//for loop for canndedFood
		str += "\nCANNED FOOD\n";
		for(int i=0; i<numPurchases; i++) {
			if(purchases[i] instanceof CannedFood) {
				str += purchases[i] + "\n";;
			}
		}
		
//		//for loop for misc items
//		str += "\nMISC ITEMS\n";
//		for(int i=0; i<numPurchases; i++) {
//			if(isMiscItem(purchases[i])) {
//				str += purchases[i] + "\n";;
//			}
//		}
		
		
		//crunching the numbers
		str += "--------------------------------------------\n"
				+ "Before tax: " + df2.format(totalBeforeTax())
				+ "\nTax: " + df2.format(totalTax())
				+ "\nTotal: " 
				+ df2.format(totalBeforeTax() + totalTax())
				+ "\nNumber of Items: " + count;
		
		return str;
	}
	
	/*
	 * Need way to know which type of items are in the receipt array
	 * Need for loop for each item type
	 * 
	 * assign number for each type
	 * 0-item
	 * 1-clothing
	 * 2-housewares
	 * 3-grocitem
	 * 4-dairy
	 * 5-canndedFood
	 */
	
//	public boolean isMiscItem(Item itm) {
//		if( !( 	(itm instanceof Clothing) || 
//				(itm instanceof Housewares) ||
//				(itm instanceof GrocItem) ||
//				(itm instanceof Dairy) ||
//				(itm instanceof CannedFood)
//				) ) {
//			return true;
//		}
//		
//		return false;
//	}


}
