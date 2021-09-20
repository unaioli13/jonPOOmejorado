package jonPOO;

public class Alumnos extends Persona{

	private int curso;
	private float nota;
	
	public Alumnos(String nombre,String apellido,String Telefono, String dni,int curso,float nota) {
		super(nombre,apellido,Telefono,dni);
		this.curso=curso;
		this.nota=nota;
		
	}
	
	public String mostrarPersona() {
		return "El alumno se llama "+nombre + apellido+", su telefono es "+Telefono+" y su dni es "+dni+" esta en el curso "+curso+" y su nota es "+nota;
		
	}
	
	public int getCurso() {
		return curso;
	} 
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}

	
	
}
