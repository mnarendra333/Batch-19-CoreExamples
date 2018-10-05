package pack1;

public class Traveller {

	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void startJourny() {
		vehicle.run();
	}

}
