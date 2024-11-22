
import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	// Method to return the quantity of ordered items
	public int qtyOrdered() {
		return itemsOrdered.size();
	}

	public ArrayList<DigitalVideoDisc> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<DigitalVideoDisc> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	// Method to add a DVD to the cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(disc);
			System.out.println("The disc has been added successfully.");
		} else {
			System.out.println("The cart is full. Cannot add more DVDs.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int N = dvdList.length;
		if (qtyOrdered() >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		} else if (qtyOrdered() + N > MAX_NUMBERS_ORDERED) {
			System.out.println("Too many discs.");
		} else {
			for (int i = 0; i < N; i++) {
				itemsOrdered.add(dvdList[i]);
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered() >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		} else {
			itemsOrdered.add(dvd1);
			System.out.println("The first disc has been added.");
			if (qtyOrdered() >= MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full.");
			} else {
				itemsOrdered.add(dvd2);
				System.out.println("The second disc has been added.");
			}
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int d = 0;
		for (DigitalVideoDisc Disc : itemsOrdered) {
			if (Disc.getTitle() == disc.getTitle()) {
				d += 1;
			}
		}
		if (d != 0) {
			itemsOrdered.remove(disc);
			System.out.println("The disc has been removed successfully.");
		} else {
			System.out.println("The disc isn't in the cart.");
		}
	}

	public float totalCost() {
		float cost = 0;
		for (DigitalVideoDisc disc : itemsOrdered) {
			cost += disc.getCost();
		}
		return cost;
	}
	
	public void display() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		float total = 0;
		for (int i = 0; i < this.qtyOrdered();i++) {
			total = total + this.itemsOrdered.get(i).getCost();
			System.out.println((i+1) + ". " + this.itemsOrdered.get(i).getTitle() + " - " + this.itemsOrdered.get(i).getCategory() + " - " + this.itemsOrdered.get(i).getDirector() + " - " + this.itemsOrdered.get(i).getLength() +": " + this.itemsOrdered.get(i).getCost() + "$");
		}
		System.out.println("Total cost: " + total);
		System.out.println("***************************************************");
	}
		
	public void print() {
	    System.out.println("Cart Summary:");
	    System.out.println("ID\tTitle\t\tCost");
	    for (DigitalVideoDisc disc : itemsOrdered) {
	        System.out.printf("%d\t%s\t\t%.2f\n", disc.getId(), disc.getTitle(), disc.getCost());
	    }
	    System.out.printf("Total Cost: %.2f\n", totalCost());
	}

}
