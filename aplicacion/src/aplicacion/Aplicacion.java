package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		ArrayList<Alumno> listaEstudiantes = new ArrayList<>();
		ArrayList<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		int sw=0;
		int contadorAlumno=0;
		int contadorAsignatura=0;
		
		do{
			System.out.println("Bienvenido al sistema de Matricula y Visualizacion");
			System.out.println("1-> Crear Alumno");
			System.out.println("3-> Mostrar Alumnos");
			System.out.println("3-> Salir");
			System.out.print("ingrese una opcion...");
			opcion = teclado.nextInt();
			
			if(opcion == 1){
				Alumno alumno = new Alumno(null, null, null);
				sw=0;
				char op=' ';
				System.out.println("ingrese el nombre del alumno");
				String nombre = teclado.next();
				alumno.setNombre(nombre);
				System.out.println("ingrese la edad del alumno");
				String edad = teclado.next();
				alumno.setEdad(edad);
				while (sw == 0){
					Alumno.agregarAsignatura(listaAsignaturas,contadorAsignatura);
					op = ' ';
					while (op == ' '){
						System.out.println("¿desea ingresar otra asignatura? y/n");
						op = teclado.next().charAt(0);
						if (op =='y'){
						}else if(op == 'n'){
							alumno.setListaAsignaturas(listaAsignaturas);
							contadorAsignatura=0;
							sw=1;
						}else{
							op = ' ';
							System.out.println("opcion invalida");
						}
					}
				}
				listaEstudiantes.add(contadorAlumno, alumno);
				contadorAlumno++;
			}
			
			if (opcion==2){
				for (int i = 0; i < listaEstudiantes.size(); i++) {
					System.out.println(listaEstudiantes.get(i).getNombre());
					System.out.println(listaEstudiantes.get(i).getEdad());
					listaEstudiantes.get(i).getListaAsignaturas();
					for (int j = 0; j < listaAsignaturas.size(); j++) {
						System.out.println(listaAsignaturas.get(j).getNombreAsignatura());
						System.out.println(listaAsignaturas.get(j).getNota());
					}
				}
			}
			
		}while(opcion != 3);
		System.out.println("Hasta Pronto, Gracias por utilizar nuestro Sistema...");
	}

}
