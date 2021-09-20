package jonPOO;

public abstract class Persona {

	protected String nombre, apellido,Telefono, dni;

	public Persona(String nombre,String apellido, String Telefono,String dni) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.Telefono=Telefono;
		this.dni=dni;
	}
	
	public abstract String mostrarPersona();
	
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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
