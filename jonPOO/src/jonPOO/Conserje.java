package jonPOO;

public class Conserje extends Persona{

	float Salario;
	String puesto;
	
	public Conserje(String nombre,String apellido,String Telefono,String dni,float salario,String puesto) {
		super(nombre,apellido,Telefono,dni);
		this.Salario=salario;
		this.puesto=puesto;
	}
	
	public String mostrarPersona() {
		return "El Conserje se llama "+nombre + apellido+", su telefono es "+Telefono+" y su dni es "+dni+" Su salario es de "+Salario+" € al mes y su puesto es "+puesto;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	
}
