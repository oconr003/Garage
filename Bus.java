
public class Bus extends Vehicle {
	public int pasengerNumber;

	public Bus(int pasengerNumber, int speed, String colour, String name) {
		super(speed, colour, name);
		this.pasengerNumber = pasengerNumber;
	}
}
