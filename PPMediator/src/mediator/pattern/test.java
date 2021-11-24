package mediator.pattern;

public class test {

	public static void main(String[] arg) {
		
		Mediator system = new Mediator();
		Car ford_123 = new Car(system);
		Button ignition = new Button(system);
		CarBattery moura = new CarBattery();
		
		system.setCar(ford_123);
		system.setBattery(moura);
		
		ignition.press();
	}
}
