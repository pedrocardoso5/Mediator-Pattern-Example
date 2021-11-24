package mediator.pattern;

public class Car {
	private Mediator mediator;
	private boolean isOn = false;
	
	//constructor
	Car(Mediator mediator){
		this.mediator = mediator;
	}
	
	public void turnOn() {
		mediator.start();
		setOn(true);
	}
	
	public void turnOff() {
		setOn(false);
		mediator.stop();
	}

	//get
	public boolean isOn() {
		return isOn;
	}
	//set
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
}
