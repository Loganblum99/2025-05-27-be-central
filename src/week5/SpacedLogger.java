package week5;




public class SpacedLogger implements Logger{
	
	
	
	public static String spacedString(String str) {
		StringBuilder string = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			string.append(str.charAt(i));
			if(i <str.length()-1) {
				string.append(" ");
			}
		}
		return string.toString();
	}
	@Override
	public void log(String log) {
		System.out.println(spacedString(log));
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("Error: "+ spacedString(error));
	}
	
}
	
