
public class FahrenheitConverter {

	public static void main(String[] args) {
		System.out.println("fahrenheit = " + toFarenheit(12));
		
		}
	public static float toFarenheit(float c) {
		float f = (c * 9 / 5f) + 32;
		return f;
		

	}

}
