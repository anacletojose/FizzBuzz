package cuentas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Cuentastests {
    Cuentas cuenta;

    @Before
    public void setUp() {
    	Cuentas cuenta = new Cuentas();
    }
	
    @Test
	public void creacion(){
	    assertEquals(0, cuenta.saldo, 0);
	}
	
    @Test
	public void acreditarSaldo() {
	    cuenta.saldo+=1000;
		assertEquals(1000, cuenta.saldo, 0);
	}
	@Test
	public void retirarSaldo() {
	    cuenta.saldo+=1000;
	    cuenta.saldo-=550;
		assertEquals(450, cuenta.saldo, 0);
	}
}
