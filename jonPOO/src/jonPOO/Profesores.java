package jonPOO;

public class Profesores extends Persona{
	
	boolean esTutor;
	int cantidadAsignaturas;
	
	public Profesores(String nombre,String apellido,String Telefono, String dni,boolean esTutor,int cantidadAsignaturas) {
		super(nombre,apellido,Telefono,dni);
		this.esTutor=esTutor;
		this.cantidadAsignaturas=cantidadAsignaturas;
	}	
	
	public String mostrarPersona() {
		return "El profesor se llama "+nombre + apellido+", su telefono es "+Telefono+" y su dni es "+dni+" es Tutor = "+esTutor+" y Tiene "+cantidadAsignaturas+" Asignaturas";
		
	}
	

	public boolean isEsTutor() {
		return esTutor;
	}
	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}
	public int getCantidadAsignaturas() {
		return cantidadAsignaturas;
	}
	public void setCantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}
	
}
