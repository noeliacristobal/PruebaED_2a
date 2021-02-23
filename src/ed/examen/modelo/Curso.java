package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	/**
	 * @author daw107 (noelia cristobal tapias)
	 * 
	 *
	 */


		
		private List<Persona> listaAlumnos;

		/**
		 * metodo para eliminar un alumno introduciendo un dni con 9 caracteres
		 * @param dni cada persona tendra un dni para diferenciarse de otra
		 * @throws Exception cuando el dni no tiene 9 caracteres
		 */
		public void eliminarAlumno(String dni) throws Exception {
			if(dni.length()==9) {//comprobar la longitud del dni
				listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
			}else {
				throw new Exception("El dni no tiene la longitud adecuada");
			}
		}
		
		/**
		 * Añadir alumno a la lista
		 * @param p
		 */
		public void aniadirAlumno(Persona p) {
			listaAlumnos.add(p);
		}
		
		/**
		 * Si la lista del alumno coincide con el dni, el alumno esta registrado
		 * @param dni
		 * @return trueo o false
		 */
		public Boolean estaRegistrado(String dni) {
			int i =0;
			Boolean encontrado=false;
			while (!encontrado && i<listaAlumnos.size()) {
				if(listaAlumnos.get(i).getDni().equals(dni)) {
					encontrado=true;
				}
				i++;
			}
			return encontrado;
		}
		
		/**
		 * metodo para la lista del alumno
		 */
		public Curso() {
			listaAlumnos= new ArrayList<Persona>();
		}
		
		/**
		 * 
		 * @return este metodo nos devuelve la lista completa de los alumnos
		 */
		public Integer numeroAlumnos() {return listaAlumnos.size();}
		
		/**
		 * metodo para mostrar toda la lista del alumnos
		 */
		public void mostrarTodos() {
			for (Persona persona : listaAlumnos) {
				System.out.println(persona);
			}
		}
	}

