package aplicacion;

public class Asignatura {
	private static String nombreAsignatura;
	private static int nota;
	
	public Asignatura(String nombreAsignatura, int nota) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nota = nota;
	}

	public static int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public boolean estado(){
		if(nota>=60){
			return true;
		}else{
			return false;
		}
	}

	public static String getNombreAsignatura() {
		return nombreAsignatura;
	}
}
