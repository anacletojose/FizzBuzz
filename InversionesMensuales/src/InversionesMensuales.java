public class InversionesMensuales {
 double montoInvertir;
 int anios;
  
 public void metodoUno(double montoInvertir, double interesAnual, double cantidadAñosMaximo) {
	 while (anios < cantidadAñosMaximo) {
		 this.montoInvertir = this.montoInvertir * (1 + interesAnual);
	     System.out.println(this.montoInvertir);
	     anios++;}
 }
 
 public int metodoDos(double montoInvertir, double interesAnual, double saldoFinalDeseado) {
	 this.montoInvertir = montoInvertir; 
	 while (this.montoInvertir < saldoFinalDeseado){
		 this.montoInvertir = this.montoInvertir * (1 + interesAnual);
		 anios++;}
	 return anios * 12;}
 }