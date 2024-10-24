
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

}
