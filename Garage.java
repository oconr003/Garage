import java.util.ArrayList;
import java.util.List;

public class Garage {
	public List<Vehicle> vehicles;

	public Garage() {
		this.vehicles = new ArrayList<Vehicle>();		// each time run method, constructor creates empty list of vehicles <-- name
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(int id) {
		this.vehicles.remove(id);
	}
	
	public void removeVehicle(Class<?> typeToRemove) {					// removing elements by element type (class of vehicles)
		for (int i=0; i < this.vehicles.size(); i++) {
			if (typeToRemove.isInstance(this.vehicles.get(i))) { 			// is the element at i index of type that is passed in
				this.vehicles.remove(i);
			}
		}
	}
	
	public double calculateBill() {
		double billTotal = 0;
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle instanceof Car) {
				billTotal = billTotal + 100;								// also wrote as billTotal=+100
			} else if (vehicle instanceof Bike) {
				billTotal = billTotal + 55.5;
			} else if (vehicle instanceof Bus) {
				billTotal = billTotal + 250;
			}
		}
		return billTotal;
	}
	
	public void clearGarage() {
		this.vehicles.clear();
	}								//		for (Vehicle vehicle: this.vehicles) {		alternative method by finding item and removing one by one
}									//		this.vehicles.remove(vehicle);			
									//		}
									//		for (int i=0;i<this.vehicles.size();i++) {	alternative method by removing each interval one by one in list
									//			this.vehicles.remove(i);
									//		}

									// 	What would go in the Main method	
	
									//	Garage myGarage= new Garage();    				Making a new garage
									//	Vehicle myCar = new Car(....);    				Creating a new car
									//	garage.addVehicle(myCar);						Add a vehicle to the garage
	
