package interface_project;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Animal animal = bird;
		FlightEnabled flier = bird;
		Trackable tracked = bird;
		
		
		animal.move();
		flier.fly();
		flier.land();
		flier.takeOff();
		tracked.track();
		inFlight(flier);
		inFlight(new Jet());
		Trackable trackable = new Truck();
		trackable.track();
	}
	private static void inFlight(FlightEnabled flier) {
		flier.takeOff();
		flier.fly();
		if(flier instanceof Trackable tracked) {
			System.out.println("Inside if");
			tracked.track();
		}
		flier.land();
	}
}
