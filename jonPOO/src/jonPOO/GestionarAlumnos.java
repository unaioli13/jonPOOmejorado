package jonPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionarAlumnos {

	public static void main(String[] args) {
		int opc;
		Scanner sc=new Scanner(System.in);

		//CREACION DE ARRAYLIST TIPO ALUMNO Y PROFESOR
		ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
		ArrayList<Profesores> profesores = new ArrayList<Profesores>();
		ArrayList<Conserje> Conserjes =new ArrayList<Conserje>();

		do {
			System.out.println("Que quieres hacer?");
			System.out.println("- dar alta alumno(0)");
			System.out.println("- dar alta a un profesor(1)");
			System.out.println("- Dar alta a Conserje(-3)");
			System.out.println("- ver alumnos matriculados(2)");
			System.out.println("- Calculaar porcentaje de aprobados(3)");
			System.out.println("- ver profesor con mas asignaturas(4)");
			System.out.println("- Ver profesores,alumnos y conserges(-2)");
			System.out.println("- salir del programa(-1)");
			opc=sc.nextInt();

			if(opc==0) {
				alumnos.add(altaAlumno(sc));
			}else if(opc==1){
				profesores.add(altaProfe(sc));
			}else if(opc==2){
				cantiAlumn(alumnos);
			}else if(opc==3){
				porcentajeAprobados(alumnos);
			}else if(opc==4){
				masAsign(profesores);
			}else if(opc==-1) {
				System.out.println("El programa a finalizado");
			}else if(opc==-2) {
				System.out.println("Profesores: ");
				for(int i=0;i<profesores.size();i++) {
					System.out.println(profesores.get(i).mostrarPersona());
				}
				System.out.println("Alumnos: ");
				for(int i=0;i<alumnos.size();i++) {
					System.out.println(alumnos.get(i).mostrarPersona());
				}
				System.out.println("Conserjes: ");
				for(int i=0;i<Conserjes.size();i++) {
					System.out.println(Conserjes.get(i).mostrarPersona());
				}
			}else if(opc==-3) {
				Conserjes.add(altaConserje(sc));
			}
		}while(!(opc==-1));
	}

	//calcular cantidad de alumnos matriculados
	public static void cantiAlumn(ArrayList<Alumnos> alumnos) {
		int pri=0, seg=0;
		for(int i=0;i<alumnos.size();i++) {
			if(alumnos.get(i).getCurso()==1) {
				pri=pri+1;
			}else if(alumnos.get(i).getCurso()==2){
				seg=seg+1;
			}
		}
		System.out.println("Hay "+pri+" alumnos matriculados en primero: ");
		System.out.println("Hay "+seg+" alumnos matriculados en segundo");

	}

	//CALCULAR PORCENTAJE DE APROBADOS
	public static void porcentajeAprobados(ArrayList<Alumnos> alumnos) {

		double porcentaje;
		int aprobados=0;

		for(int i=0;i<alumnos.size();i++) {
			if(alumnos.get(i).getNota()>=5) {
				aprobados+=aprobados;
			}
		}
		porcentaje=(double)100*(double)aprobados/(double)alumnos.size();
		System.out.println("El porcentaje de aprobados es: "+porcentaje+"%");
	}

	//SACAR PROFESOR "TUTOR" CON MAS ASIGNATURAS
	public static void masAsign(ArrayList<Profesores> profesores) {
		int asignaturas=0;

		for(int i=0;i<profesores.size();i++) {
			if(profesores.get(i).esTutor && profesores.get(i).cantidadAsignaturas>asignaturas) {
				asignaturas=profesores.get(i).cantidadAsignaturas;
			}
			if(profesores.get(i).cantidadAsignaturas==asignaturas)	{
				System.out.println("El profesor tutor con mas asignaturas es "+asignaturas+" asignaturas");
			}
		}
	} 

	//crear un nuevo alumno con peticion de datos
	public static Alumnos altaAlumno(Scanner sc) {

		String nombre,apellido,Telefono,dni;
		int curso;
		float nota;

		System.out.println("Introduce el nombre del alumno");
		nombre=sc.next();

		System.out.println("Introduce el apellido del Alumno");
		apellido=sc.next();

		System.out.println("Introduce el Telefono del alumno");
		Telefono=sc.next();

		System.out.println("Introduce el dni del alumno");
		dni=sc.next();
		do {
			System.out.println("Introduce el curso del alumno");
			curso=sc.nextInt();
		}while(curso<1 || curso>2);

		do {
			System.out.println("Introduce la nota del alumno");
			nota=sc.nextFloat();
		}while(nota<0 || nota>10);
		Alumnos Alumno = new  Alumnos(nombre,apellido,Telefono,dni,curso,nota);

		return Alumno;
	}

	//DAR ALTA A UN PROFESOR
	public static Profesores altaProfe(Scanner sc) {

		String nombre,apellido,Telefono,dni;
		boolean esTutor;
		int cantidadAsignaturas;

		System.out.println("Introduce el nombre del Profesor");
		nombre=sc.next();

		System.out.println("Introduce el apellido del Profesor");
		apellido=sc.next();

		System.out.println("Introduce el Telefono del Profesor");
		Telefono=sc.next();

		System.out.println("Introduce el dni del Profesor");
		dni=sc.next();

		do {
		System.out.println("Introduce si el profesor es tutor o no (true/false)");
		esTutor=sc.nextBoolean();
		}while(!(esTutor==false)&&!(esTutor==true));
		System.out.println("Introduce cantidad de asignaturas");
		cantidadAsignaturas=sc.nextInt();

		Profesores Profesor = new  Profesores(nombre,apellido,Telefono,dni,esTutor,cantidadAsignaturas);

		return Profesor;
	}
	
	//DAR ALTA A CONSERGE
	public static Conserje altaConserje(Scanner sc) {

		String nombre,apellido,Telefono,dni;
		String puesto;
		float Salario;

		System.out.println("Introduce el nombre del conserje");
		nombre=sc.next();

		System.out.println("Introduce el apellido del conserje");
		apellido=sc.next();

		System.out.println("Introduce el Telefono del conserje");
		Telefono=sc.next();

		System.out.println("Introduce el dni del conserje");
		dni=sc.next();
		
			System.out.println("Introduce el salario del conserje");
			Salario=sc.nextFloat();
			
			do {
			System.out.println("Introduce el puesto del conserje (Jefe/Subjefe)");
			puesto=sc.next();
			}while(!(puesto.equalsIgnoreCase("jefe"))||!(puesto.equalsIgnoreCase("Subjefe")));
			Conserje conserje=new Conserje(nombre,apellido,Telefono,dni,Salario,puesto);

		return conserje;
	}
}
