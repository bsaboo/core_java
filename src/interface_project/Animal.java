package interface_project;

interface FlightEnabled {
	void takeOff();

	void fly();

	void land();
}

interface Trackable {
	void track();
}

public abstract class Animal {
	public abstract void move();
}
