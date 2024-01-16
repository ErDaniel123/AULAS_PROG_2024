package practic_arrays;


public class Start {

	public static void main(String[] args) {
		Aula aula= new Aula(4);
		Alumnos alumno1=new Alumnos();
		Alumnos alumno2=new Alumnos();
		
		alumno1.setNombre("Juan");
		alumno1.setCodigoAlumno(43645);
		
		alumno2.setNombre("Jose");
		alumno2.setCodigoAlumno(44545);
		
	Alumnos alumno3=new Alumnos();
		
		alumno3.setNombre("Michel Angelo");
		alumno3.setCodigoAlumno(54322);
		
	Alumnos alumno4=new Alumnos();
		
		alumno4.setNombre("Pedri");
		alumno4.setCodigoAlumno(3453);
		
		
		aula.addAlumno(alumno1);
		aula.addAlumno(alumno2);
		aula.addAlumno(alumno3);
		aula.addAlumno(alumno4);
		System.out.println("Hay "+aula.getContador()+" alumnos");
		System.out.println(aula);

	}

}
