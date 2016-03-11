package aplicacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	static Scanner texto = new Scanner(System.in);
	private static ArrayList<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();
	private String nombre;
	private String edad;
	
	public Alumno(String nombre, String edad, Object objeto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.listaAsignaturas = listaAsignaturas;
	}

	public static ArrayList<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public static void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
		Alumno.listaAsignaturas = listaAsignaturas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	public int promedio (ArrayList<Asignatura> ListaAsignaturas){
		int promedio=0;
		int cont=0;
		for (int i = 0; i < ListaAsignaturas.size(); i++) {
			promedio = ListaAsignaturas.get(i).getNota();
			cont++;
		}
		promedio /= cont;
		return promedio;
	}
	
	public static void agregarAsignatura(ArrayList<Asignatura> ListaAsignaturas, int contadorAsignatura){
		boolean caso=true;
		System.out.println("ingrese el nombre de la asignatura "+contadorAsignatura);
		String asignatura = texto.next();
		System.out.println("digite la nota de la asignatura");
		int nota = texto.nextInt();
		for (int i = 0; i < ListaAsignaturas.size(); i++) {
			if(asignatura == ListaAsignaturas.get(i).getNombreAsignatura()){
				System.out.println("esta asignatura ya se encuentra en este plan de estudio");
				caso=false;
			}
		}
		if(caso == true){
			Asignatura aux = new Asignatura(asignatura, nota);
			contadorAsignatura++;
		}
	}
}
