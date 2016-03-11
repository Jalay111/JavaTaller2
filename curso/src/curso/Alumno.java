package curso;

public class Alumno {
	String id;
	String nombre;
	int promedio;
	
	public Alumno(String id, String nombre, int promedio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.promedio = promedio;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
}
