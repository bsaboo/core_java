package interface_project;

public class Truck implements Trackable {

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + " is Tracking");
		
	}

}
