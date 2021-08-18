package figuras;

public class Circulo {
 private double radio;
 private Punto centro;
	
  public Circulo(Punto centro, double radio) {
	  this.radio = radio;
	  this.centro = centro;
  }
  
  public boolean intersectaCon(Circulo otro) {
	  return ((this.radio + otro.radio)> centro.distanciaEntre(otro.centro));
  }

  public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(3,1),1);
		Circulo c2 = new Circulo(new Punto(1,1),2);
		System.out.println(c1.intersectaCon(c2));
	}
}
