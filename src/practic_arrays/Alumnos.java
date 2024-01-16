package practic_arrays;

public class Alumnos {
	private String nombre;
	
	private int codigoAlumno;
	
	
	
	
			
		
		
		public String getNombre() {
		return nombre;
	}



	@Override
		public String toString() {
			return " [nombre=" + nombre + ", codigoAlumno=" + codigoAlumno + "]";
		}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCodigoAlumno() {
		return codigoAlumno;
	}



	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}


}
