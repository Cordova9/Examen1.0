import java.util.ArrayList;
import java.util.List;

public class Pasajeros extends Personas {
	
	String codigo_pasajero= getNombre().substring(0,3)+getDni();
	public Pasajeros() {
		super();
	}
	
	public Pasajeros(String nombre, String apellido, String dni, int edad, String sexo) {
		super(nombre, apellido, dni, edad, sexo);

	}

	int visa;

	public void Visa() {
		if (visa == 1) {
			System.out.println("Tiene visa");
		} else {
			System.out.println("No tiene visa");
		}
	}

	
	public int getVisa() {
		return visa;
	}

	public void setVisa(int visa) {
		this.visa = visa;
	}

	public void Imprimir() {
		System.out.println("------Datos del pasajero----");
		System.out.println("Codigo: "+codigo_pasajero);
		Visa();
		super.Imprimir();
		
	}

}
