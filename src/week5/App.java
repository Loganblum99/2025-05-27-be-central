package week5;

public class App {

	public static void main(String[] args) {
		Logger asterisk = new AsteriskLogger();
		asterisk.log("Five");
		asterisk.error("Sonic the fast food place");
		Logger spaced = new SpacedLogger();
		spaced.log("asbestos");
		spaced.error("azure");
		
	}

}
