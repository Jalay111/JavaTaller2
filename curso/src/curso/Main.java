package curso;

import java.util.Scanner;

public class Main {

	static Scanner texto = new Scanner(System.in);

	public static int menu(){
		System.out.println("1-> Matricular");
		System.out.println("2-> Poner Notas");
		System.out.println("3-> Mostrar Expediente");
		System.out.println("4-> Salir");
		System.out.print("Ingrese opcion: ");
		int opcion = texto.nextInt();
		return opcion;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
