package mediator.pattern;

public class Button {
	private Mediator mediator;
	
	//constructor
	Button(Mediator mediator){
		this.mediator = mediator;
	}
	
	public void press() {
		mediator.press();
	}
}
