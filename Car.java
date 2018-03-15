
public class Car extends Vehicle {
	public int bootsize;

	public Car(int bootsize, int speed, String colour, String name) {
		super(speed, colour, name);
		this.bootsize = bootsize;	
	}	
}
