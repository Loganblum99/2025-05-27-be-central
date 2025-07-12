package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		StringBuilder asterisk = new StringBuilder();
		for(int i = 0; i < (13 + error.length()); i++) {
			asterisk.append("*");
		}
		System.out.println(asterisk.toString());
		System.out.println("***ERROR: " + error + "***");
		System.out.println(asterisk.toString());
	}

}
