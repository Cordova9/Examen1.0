import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	private String hora;
	public Aviones aviones;
	public Pilotos pilotos;
	public Aviones avion;

	public Vuelos() {
		hora = "15:00";
		registro_pasajeros = new ArrayList<Pasajeros>();
		aviones = new Aviones();
		pilotos = new Pilotos();
		RegistroPasajeos();
	}

	List<Pasajeros> registro_pasajeros;

	public List<Pasajeros> getRegistro_pasajeros() {
		return registro_pasajeros;
	}

	public void setRegistro_pasajeros(List<Pasajeros> registro_pasajeros) {
		this.registro_pasajeros = registro_pasajeros;
	}

	public void RegistroPasajeos() {

		Pasajeros p1 = new Pasajeros();
		registro_pasajeros.add(p1);
		Pasajeros p2 = new Pasajeros();
		registro_pasajeros.add(p2);
		Pasajeros p3 = new Pasajeros();
		registro_pasajeros.add(p3);

	}

	public Vuelos(String hora, Aviones aviones) {
		super();
		this.hora = hora;
		this.aviones = aviones;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getAviones() {
		return aviones;
	}

	public void setAviones(Aviones aviones) {
		this.aviones = aviones;
	}

	public Pilotos getPilotos() {
		return pilotos;
	}

	public void setPilotos(Pilotos pilotos) {
		this.pilotos = pilotos;
	}

	public void Imprimir() {
		aviones.Imprimir();
		System.out.println("--Hora de vuelo: " + hora + "--");
		pilotos.Imprimir();
		System.out.println(">>>>Registro de pasajeros<<<<");
		ImprimirPasajeros();

	}

	public void ImprimirPasajeros() {
		for (Pasajeros variable : registro_pasajeros) {
			variable.Imprimir();
		}

	}

}
