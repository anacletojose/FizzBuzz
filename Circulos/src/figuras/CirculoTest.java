package figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void creacionNoNula() {
	Circulo c1= new Circulo(new Punto(1, 1), 3);
	assertNotNull(c1);
	}
 
	@Test
	public void interseccionCirculos() {
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		Circulo c2 = new Circulo(new Punto(4, 3.5), 1.5);
		assertEquals(true, c1.intersectaCon(c2));
	}
	
	@Test
	public void noInterseccionCirculos() {
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		Circulo c2 = new Circulo(new Punto(6, 3), 1.5);
		assertEquals(false, c1.intersectaCon(c2));
	}
	
	@Test
	public void circuloDentroDeOtro() {
		Circulo c1 = new Circulo(new Punto(1, 1), 6);
		Circulo c2 = new Circulo(new Punto(1, 2), 1.5);
		assertEquals(true, c1.intersectaCon(c2));
	}
	
	@Test
	public void mismosCirculos() {
		Circulo c1 = new Circulo(new Punto(1, 3), 4);
		Circulo c2 = new Circulo(new Punto(1, 3), 4);
		assertEquals(true, c1.intersectaCon(c2));
	}
}
