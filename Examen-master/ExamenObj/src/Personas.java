
public class Personas {
	public String nombre;
	public String apellido;
	public String dni;
	int edad;
	public String sexo;
	
	
	public Personas() {
		super();
		this.nombre = "nombre";
		this.apellido = "apellido";
		this.dni = "dni";
		this.edad =0;
		this.sexo = "sexo";
	}


	public Personas(String nombre,String apellido,String dni,int edad,String sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.sexo =sexo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void Imprimir() {
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Dni: "+dni);
		System.out.println("Edad "+edad);
		System.out.println("Sexo: "+sexo);
		
	}	
}
