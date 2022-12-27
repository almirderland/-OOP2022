package Lab1;

public class TestT {
	
	public static void main(String[] args) {
	 Temperature t = new Temperature();
	 t.setTempAndScale(150.5, 'F');
	 System.out.println(t.getCelciusTemp());
	 System.out.println(t.getFarenheitTemp());
	}
}
