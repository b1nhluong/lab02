
public class Store {
	public static final int MAX = 249;
	private int quantiryStored = 0;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX];
	
	public void addDVD(DigitalVideoDisc dvd) {
		if (this.quantiryStored >= MAX) {
			System.out.println("The store is full.");
		} else {
			this.itemsInStore[quantiryStored] = dvd;
			this.quantiryStored++;
			System.out.println("The DVD has been successfullly added.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		int pos = -1;
		for (int i = 0; i< this.quantiryStored;i++) {
			if (this.itemsInStore[i] == dvd) {
				pos = i;
				break;
			}
		}
		if ( pos<0) {
			System.out.println("No such disc found.");
		} else {
			for (int i = pos ;i <this.quantiryStored -1;i++) {
				this.itemsInStore[i] = this.itemsInStore[i+1];
			}
			this.quantiryStored = this.quantiryStored-1;
			System.out.println("The DVD was successfully removed.");
		}
	}
}
