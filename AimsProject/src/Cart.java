
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
