package interface_project;

public class Bird extends Animal implements FlightEnabled, Trackable {

	@Override
	public void move() {
		System.out.println("Bird moving");

	}

	@Override
	public void takeOff() {
		System.out.println(getClass().getSimpleName() +" is taking off");

	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() +" is Flying");

	}

	@Override
	public void land() {
		System.out.println(getClass().getSimpleName() +" is Landing");

	}

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() +" is Tracking");

	}

}
