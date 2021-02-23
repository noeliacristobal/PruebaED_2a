package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p = new Persona("12345678P", "Noelia", "Cristobal");
	
	@Test
	void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		assertEquals("12345678P",p.getDni());
		boolean exceptionLanzada = false;
		try {
			p.setDni("000000000");
		}catch (Exception e) {
			exceptionLanzada=true;
		}
		assertEquals(true, exceptionLanzada);
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("00000000P");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("00000000P",p.getDni());
		
	}

	
	@Test
	void testGetNombre() {
		assertEquals("Noelia", p.getNombre());
	}

	@Test
	void testSetNombre() {
		try {
			noelia.setDni("12345678P");
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertEquals("Pepe",noelia.getNombre());
	}

	@Test
	void testGetApellido1() {
		try {
			noelia.setApellido1("Perez");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Perez",noelia.getApellido1());
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
