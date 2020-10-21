
public class ParkingLot {

	public static void main(String[] args) {
		Car familySedan = new Car();
		System.out.println("The family sedan has: " + familySedan.getNumWheels() + " wheels");
		
		System.out.println();
		
		Convertible miata = new Convertible();
		System.out.println("The miata has: " + miata.getNumWheels() + " wheels");
		miata.putTopDown();
		
		System.out.println();

		SportsCar lambo = new SportsCar();
		System.out.println("The lambo has: " + lambo.getNumWheels() + " wheels");
		lambo.pressTheGas();
	}

}
