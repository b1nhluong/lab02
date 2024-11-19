
public class Aims {
	public static void main(String[] args) {
		Cart cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

		
		
		cart.addDigitalVideoDisc(dvd1);
		cart.addDigitalVideoDisc(dvd2);
		cart.addDigitalVideoDisc(dvd3);
		cart.addDigitalVideoDisc(new DigitalVideoDisc[] {dvd1, dvd2});
		cart.addDigitalVideoDisc(dvd2, dvd3);
		System.out.print("The total cost is: ");
		System.out.println(cart.totalCost());

		cart.removeDigitalVideoDisc(dvd3);
	}
}
