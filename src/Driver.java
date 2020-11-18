
public class Driver {

	public static void main(String[] args) {
		//make two lists and add 20-25 items to each list
		//use assert statements to test
		//make it print by category
		Receipt list = new Receipt(25);
		//5
		Dairy milk = new Dairy("Milk", 3, 2, "11-1-20");
		CannedFood tuna = new CannedFood("Tuna", 1.50, 1, false,4);
		GrocItem slaw = new GrocItem("Slaw", 4, 4, true);
		GrocItem flour = new GrocItem("Flour", 2, 2, false);
		Clothing pants = new Clothing("Pants", 20, 1, 'M', "Red");
		
		list.add(milk);
		list.add(tuna);
		list.add(slaw);
		list.add(flour);
		list.add(pants);
		
		assert(list.totalBeforeTax() == 47.5);
		assert(list.totalTax() == 0);
		//10
		Housewares pan = new Housewares("Pan", 15, 1, "Non-stick");
		Clothing shirt = new Clothing("Shirt", 10, 2, 'M', "Blue");
		Clothing socks = new Clothing("Socks", 10, 4, 'M', "White");
		Clothing jacket = new Clothing("Jacket", 25, 2, 'L', "Black");
		Clothing shoes = new Clothing("Shoes", 10, 2, 'M', "Brown");
		
		list.add(pan);
		list.add(shirt);
		list.add(socks);
		list.add(jacket);
		list.add(shoes);
		
		assert(list.totalBeforeTax() == 47.5+145);
		//15
		Dairy chocMilk = new Dairy("Chocolate Milk", 9.59, 2, "11-1-20");
		Housewares mits = new Housewares("Oven Mits", 15, 2, "Leather");
		Housewares toaster = new Housewares("Toaster", 50, 1, "Aluminum");
		Housewares microwave = new Housewares("Microwave", 50, 1, "Electronic");
		Housewares knife = new Housewares("Knife", 50, 1, "Metal");
		
		list.add(chocMilk);
		list.add(mits);
		list.add(toaster);
		list.add(microwave);
		list.add(knife);
		
		//20
		CannedFood pears = new CannedFood("Pear", 1.50, 1, true, 4);
		GrocItem apples = new GrocItem("Apples", 1.20, 8, true);
		GrocItem bannana = new GrocItem("Bannana", 2.29, 2, true);
		GrocItem carrot = new GrocItem("Carrot", 2.89, 12, true);
		GrocItem sugar = new GrocItem("Sugar", 2, 2, false);
		
		list.add(pears);
		list.add(apples);
		list.add(bannana);
		list.add(carrot);
		list.add(sugar);
		
		assert(list.totalBeforeTax() == 446.04);
		
		System.out.println(list);

	}

}
