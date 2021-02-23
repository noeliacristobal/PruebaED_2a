package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		Persona noelia = new Persona("12345678L", "Noelia", "Cristobal");
		micurso.aniadirAlumno(noelia);

		Integer Numerodealumnosantes = micurso.numeroAlumnos();

		micurso.eliminarAlumno(noelia.getDni());

		assertEquals(Numerodealumnosantes.intValue() - 1, micurso.numeroAlumnos().intValue());
		assertFalse(micurso.estaRegistrado(noelia.getDni()));
	}

	@Test
	void testAniadirAlumno() {
		Integer Numerodealumnosantes = micurso.numeroAlumnos();

		Persona noelia = new Persona("12345678P", "Noelia", "Cristobal");
		micurso.aniadirAlumno(noelia);

		assertEquals(Numerodealumnosantes.intValue() + 1, micurso.numeroAlumnos().intValue());
		assertTrue(micurso.estaRegistrado(noelia.getDni()));
	}

	@Test
	void testEstaRegistrado() {
		Persona miguel = new Persona("12345678P", "Noelia", "Cristobal");
		Persona Antonio = new Persona("12345678J", "Pedro", "Gomez");

		micurso.aniadirAlumno(noelia);

		assertTrue(micurso.estaRegistrado(noelia.getDni()));
		assertFalse(micurso.estaRegistrado(pedro.getDni()));
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(micurso.numeroAlumnos(), new Integer(0));
	}

	

}
