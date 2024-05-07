package codigo;

public class Recorrer {

	public void RecorrerPalabra(String palabra) {
		for(int i=1; i<palabra.length();i++) {
			System.out.println(palabra.charAt(i));
		}
	}
}
