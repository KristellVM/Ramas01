package ejercicios;

import java.util.Scanner;

import util.Funciones;

public class Ramas01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		double nota = 0;
		double cont = 0;
		double suma = 0;
		double notaMin = Integer.MAX_VALUE, notaMax = Integer.MIN_VALUE;
		do {
			System.out.println("--- Selecciona el tipo de operaci�n: ---");
			System.out.println("1. Agregar nota de un alumno");
			System.out.println("2. Calcular promedio");
			System.out.println("3. Mostrar nota m�s alta");
			System.out.println("4. Mostrar nota m�s baja");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Elige la opci�n:",sc);
			switch(opcion) {
			 case 1:
				nota = agregarNota("Agregar nota",sc);
				System.out.println("La nota agregada es: "+nota);
				suma = suma+nota;
				cont++;
				break;
			case 2:
				double promedio = calcularPromedio(suma,cont);
				System.out.println("El promedio de notas es: "+promedio);
				break;
			case 3:
				notaMax = Math.max(notaMax, nota);
				System.out.println("La nota m�xima es: "+notaMax);
				break;
			case 4:
				notaMin = Math.min(notaMin, nota);
				System.out.println("La nota m�s baja es: "+notaMin);
				break;
			case 0:
				System.out.println("Termin� su operaci�n");
				break;
			}
		}while(opcion!=0);

	}
	
	public static double agregarNota(String texto,Scanner sc) {
		double nota = Funciones.dimeDouble(texto, sc);
		return nota;
	}
	
	public static double calcularPromedio(double suma,double cont) {
		return suma/cont;
	}
	
}
