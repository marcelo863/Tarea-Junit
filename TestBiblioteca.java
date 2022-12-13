package Default;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestBiblioteca extends TestCase{
	public TestBiblioteca() {
		super();
	}
	
	private static Biblioteca Bib;
	
	public static void setup() {
		Bib = new Biblioteca();
		Bib.Catalogo = new ArrayList<Libro>();
	}
	
	public static void test_Registro() {
		//Given
		setup();
		//When
		boolean R1 = Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		boolean R2 = Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía"); 
		//Then
		assertTrue(R1);
		assertTrue(R2);
	}
	
	public void test_Buscar() {
		//Given
		setup();
		Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		Bib.registrar_libro("Don Quijote de La Mancha", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369526, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		//when
		boolean R1 = Bib.buscar_libro(1, "El quijote");
		boolean R2 = Bib.buscar_libro(2, "Miguel Cervantes"); 
		boolean R3 = Bib.buscar_libro(3, "25369525");
		boolean R4 = Bib.buscar_libro(1, "Hola");
		boolean R5 = Bib.buscar_libro(4, "Hola");
		
		//Then
		assertTrue(R1);
		assertTrue(R2);
		assertTrue(R3);
		assertTrue(!R4);
		assertTrue(!R5);
	}
	
	public void test_Edit() {
		//Given
		setup();
		Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		//When
		boolean R1 = Bib.editar_libro_String("El quijote", 1, "Don Quijote de la Mancha");
		boolean R2 = Bib.editar_libro_String("El quijote", 1, "Don Quijote de la Mancha");
		boolean R3 = Bib.editar_libro_String("Don Quijote de la Mancha", 2, "El manco");
		boolean R4 = Bib.editar_libro_String("Don Quijote de la Mancha", 3, "12/8/1457");
		boolean R5 = Bib.editar_libro_String("Don Quijote de la Mancha", 4, "321");
		boolean R6 = Bib.editar_libro_String("Don Quijote de la Mancha", 5, "Ivrea");
		boolean R7 = Bib.editar_libro_String("Don Quijote de la Mancha", 6, "Falsa Fantasía");
		boolean R8 = Bib.editar_libro_String("Don Quijote de la Mancha", 7, "15368643");
		boolean R9 = Bib.editar_libro_String("Don Quijote de la Mancha", 8, "Pasillo 8, estane 1");
		boolean R10 = Bib.editar_libro_String("Don Quijote de la Mancha", 9, "Viejo loco inventa enemigos imaginarios y pierde");
		boolean R11 = Bib.editar_libro_String("Don Quijote de la Mancha", 11, "Don Quijote de la Mancha");		
		//Then
		assertTrue(R1);
		assertTrue(!R2);
		assertTrue(R3);
		assertTrue(R4);
		assertTrue(R5);
		assertTrue(R6);
		assertTrue(R7);
		assertTrue(R8);
		assertTrue(R9);
		assertTrue(R10);
		assertTrue(!R11);
	}
	
	public void test_Borrar() {
		//Given
		setup();
		Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		//When
		boolean R1 = Bib.eliminar_libro("El quijote");
		boolean R2 = Bib.eliminar_libro("El quijote");
		
		//Then
		assertTrue(R1);
		assertTrue(!R2);
	}
	
	public void test_Change() {
		//Given
		setup();
		Bib.registrar_libro("El quijote", "Miguel Cervantes", "27/12/1998", 237, "Barco de Vapor", "Aventura", 25369525, "Pasillo 3, estante 3", "Disponible", "Un viejo obesionado con los libros vive aventuras en su mundo de fantasía");
		//When
		boolean R1 = Bib.change_state("El quijote", 1);
		boolean R2 = Bib.change_state("El quijote", 1);
		boolean R3 = Bib.change_state("El quijote", 2);
		boolean R4 = Bib.change_state("El quijote", 2);
		boolean R5 = Bib.change_state("El quijote", 3);
		boolean R6 = Bib.change_state("El quijote", 3);
		boolean R7 = Bib.change_state("El quijote", 1);
		boolean R8 = Bib.change_state("El quijote", 4);
		boolean R9 = Bib.change_state("El quijote", 4);
		boolean R10 = Bib.change_state("El quijote", 5);
		//Then
		assertTrue(R1);
		assertTrue(!R2);
		assertTrue(R3);
		assertTrue(!R4);
		assertTrue(R5);
		assertTrue(!R6);
		assertTrue(!R7);
		assertTrue(R8);
		assertTrue(!R9);
		assertTrue(!R10);
	}
}
