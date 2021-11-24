package mediator.pattern;

public class Mediator {
	//private Button button;
	private Car car;
	private CarBattery carBattery;
	
	//set
	public void setBattery(CarBattery carBattery) {
		this.carBattery = carBattery;
	}
	
	public void setCar(Car car) {
		this.car = car;
		
	}
	//constructor
	Mediator(){
		
	}
	
	
	public void press() {
		if(car.isOn()) {
			car.turnOff();
		}
		else {
			car.turnOn();
		}
	}
	
	public void start() {
		carBattery.turnOn();
	}
	public void stop() {
		carBattery.turnOff();
	}
}
