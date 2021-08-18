package sumacifras;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumadorTests {
    Sumador sumador;
	@Before
	public void setup() {
		sumador = new Sumador();
	}
	
	@After
	public void teardawn() {
		sumador = null;
	}
	
	@Test
	public void sumarCifra() {
	Sumador sumador = new Sumador();
	assertEquals(5, sumador.SumarCifras(2561));}
	
	@Test
	public void sumarCifra2() {
	Sumador sumador = new Sumador();
	assertEquals(2, sumador.SumarCifras(4889));}
	
	@Test
	public void sumarCifra3() {
	Sumador sumador = new Sumador();
	assertEquals(7, sumador.SumarCifras(9889));}
	@Test
	public void sumarCifra4() {
	Sumador sumador = new Sumador();
	assertEquals(3, sumador.SumarCifras(12));}
	@Test
	public void sumarCifra5() {
	Sumador sumador = new Sumador();
	assertEquals(1, sumador.SumarCifras(10));}
}
