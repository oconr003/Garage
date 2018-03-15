
public class Main {

	public static void main(String[] args) {
		Car mrSmithsCar = new Car(50, 100, "red", "BMW" );				// calling the constructor within those classes
		Bus bensBus = new Bus(62, 70, "green", "Volvo");
		Bike billysBike = new Bike(true, 20, "grey", "Yamaha");
		Car mrsLogansCar = new Car(10, 80, "yellow", "Ford");
		Garage dodgyGarage = new Garage();
		
		
		System.out.println(dodgyGarage.calculateBill());
		
		dodgyGarage.addVehicle(mrsLogansCar);							// dodgyGarage has now added 4 vehicles in its list
		dodgyGarage.addVehicle(billysBike);
		dodgyGarage.addVehicle(bensBus);
		dodgyGarage.addVehicle(mrSmithsCar);
		
		
		System.out.println(dodgyGarage.calculateBill());					// total bill now vehicles have been added
		
		dodgyGarage.removeVehicle(2);									// bensBus is removed
		
		System.out.println(dodgyGarage.calculateBill());
		
		dodgyGarage.removeVehicle(Car.class);							// removing all cars
		
		System.out.println(dodgyGarage.calculateBill());
		
		dodgyGarage.clearGarage();
		
		System.out.println(dodgyGarage.calculateBill());					// Calculate bill now garage is clear, should be 0
					
	}

}
