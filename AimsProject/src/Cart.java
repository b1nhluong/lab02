
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added: " + disc.getTitle() + " to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                // Shift elements to the left after removing the disc
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;  // Nullify the last slot
                qtyOrdered--;
                found = true;
                System.out.println("Removed: " + disc.getTitle() + " from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }
	public void displayCart() {
        System.out.println("Current DVDs in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle());
        }
    }
}