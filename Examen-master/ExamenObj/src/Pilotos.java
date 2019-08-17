
public class Pilotos extends Personas {

	String codigo_piloto = getNombre().substring(0, 3) + getDni();

	public Pilotos() {
		super();//constructor de personas
	}

	public Pilotos(String nombre, String apellido, String dni, int edad, String sexo, int cargo) {
		super(nombre, apellido, dni, edad, sexo);
	}

	public void Imprimir() {
		System.out.println("------Datos del piloto-----");
		System.out.println("Codigo: " + codigo_piloto);
		super.Imprimir();
	}
}
