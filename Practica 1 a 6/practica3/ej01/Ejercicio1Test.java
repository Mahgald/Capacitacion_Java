package practica3.ej01;

public class Ejercicio1Test {

	public static void main(String[] args) {
		
/*		Analize el objeto Universidad. Piense en caracteristicas y acciones que se le puedan atribuir al mismo. 
		En base a lo analizado, modele la clase que lo representa con sus atributos y métodos correspondientes.*/

	
		Universidad unlp= new Universidad("Universidad Nacional de La Plata", "La Plata");
		
		Carrera li= new Carrera("Licenciatura en Informatica", 32);
		Carrera ls= new Carrera("Licenciatura en Sistemas", 32);
		Carrera apu= new Carrera("Analista Programador Universitario", 16);
		
		Profesor p1= new Profesor("Juan Carlos Pelotudo", "Lic. en Informatica", 18000);
		Profesor p2= new Profesor("Elcho tolarge", "Lic. en Informatica", 24000);
		Profesor p3= new Profesor("El loco de la 38", "Lic. en Sistemas", 35000.500f);
		Profesor p4= new Profesor("Pedro Troglio", "Analista", 11000);
		Profesor p5= new Profesor("Gustavo Alfaro", "Analista", 11000);
		
		Alumno a1= new Alumno("Fede Diaz Cano", 112354);
		Alumno a2= new Alumno("Lucas Albo", 35412);
		Alumno a3= new Alumno("Ricardo Surribas", 19874);
		Alumno a4= new Alumno("Antonella", 985498);
		
		unlp.agregarCarreras(li);
		unlp.agregarCarreras(ls);
		unlp.agregarCarreras(apu);
		
		
		
		unlp.agregarProfesores(p1);
		unlp.agregarProfesores(p2);
		unlp.agregarProfesores(p3);
		unlp.agregarProfesores(p4);
		unlp.agregarProfesores(p5);
		
		li.agregarAlumno(a1);
		li.agregarAlumno(a3);
		apu.agregarAlumno(a2);
		ls.agregarAlumno(a4);
		
		Materia m1 = new Materia("ADP", 190, true, 5000f);
		Materia m2 = new Materia("FOD", 95, false, 2500f);
		Materia m3 = new Materia("DBD", 95, true, 3000f);
		Materia m4 = new Materia("AYED", 120, false, 8000f);
		li.agregarMateria(m1);
		li.agregarMateria(m3);
		li.agregarMateria(m4);
		ls.agregarMateria(m2);
		
		
		System.out.println("La cantidad de materias de LI "+li.cantMaterias());
		System.out.println("La cantidad de alumnos de LI "+li.cantInscriptos());
		
		
		
	
	
	
	}

}
