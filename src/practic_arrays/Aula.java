package practic_arrays;

import java.util.Arrays;

public class Aula {
private Alumnos alumnos[];

	

	private int contador ;

	public Aula(int cantidadAlumnos) {

		alumnos = new Alumnos[cantidadAlumnos];
		contador=0;
	}

	public void addAlumno(Alumnos alumno1) {

		
		
		alumnos[contador]=alumno1;
		
		contador++;
		
	
		
		
	
		

	
	}

	public int getContador() {
		return contador;
	}
	
	public String toString() {
		
		

		
		
	 return " [ "+ Arrays.toString(alumnos) +  "]";
	}

}
