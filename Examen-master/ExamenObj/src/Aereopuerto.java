import java.util.ArrayList;
import java.util.List;

public class Aereopuerto {
	private String nombre;
	private String ciudad;
	Vuelos vuelos;

	public Aereopuerto() {
		nombre = "Jorge Chavez";
		ciudad = "Lima";
		registro_vuelos = new ArrayList<Vuelos>();
		RegistroVuelos();
		//vuelos = new Vuelos();
		
		//adicionalmente agrego  un pasajero
//		Pasajeros p1 = new Pasajeros();
//		p1.setNombre("Cesar");
//		p1.setVisa(1);
//		vuelos.getRegistro_pasajeros().add(p1);

	}
	List<Vuelos> registro_vuelos;

	public List<Vuelos> getRegistro_vuelos() {
		return registro_vuelos;
	}

	public void setRegistro_vuelos(List<Vuelos> registro_vuelos) {
		this.registro_vuelos = registro_vuelos;
	}

	public void RegistroVuelos() {

		Vuelos v1 = new Vuelos();
		registro_vuelos.add(v1);
		Vuelos v2 = new Vuelos();
		registro_vuelos.add(v2);
		Vuelos v3 = new Vuelos();
		registro_vuelos.add(v3);
		Pasajeros p1 = new Pasajeros();
		p1.setNombre("Cesar");
		p1.setApellido("Perez");
		p1.setDni("5646873");
		p1.setEdad(56);
		p1.setSexo("Masculino");
		p1.setVisa(1);
		v3.getRegistro_pasajeros().add(p1);
		

	}

	public Aereopuerto(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Vuelos getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelos vuelos) {
		this.vuelos = vuelos;
	}

	public void Imprimir() {
		System.out.println("AEREOPUERTO " + nombre);
		System.out.println("-ciudad: " + ciudad);
		//vuelos.Imprimir();
		ImprimirVuelos();
	}
	public void ImprimirVuelos() {
		for(Vuelos variable : registro_vuelos) {
			variable.Imprimir();
		}
	}

}
