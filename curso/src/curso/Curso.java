package curso;

public class Curso {
	String nombre;
	int nominaAlumnos;
	
	public Curso(String nombre, int nominaAlumnos) {
		super();
		this.nombre = nombre;
		this.nominaAlumnos = nominaAlumnos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNominaAlumnos() {
		return nominaAlumnos;
	}
	public void setNominaAlumnos(int nominaAlumnos) {
		this.nominaAlumnos = nominaAlumnos;
	}
}
