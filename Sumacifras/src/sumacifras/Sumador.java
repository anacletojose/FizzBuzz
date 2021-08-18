package sumacifras;

public class Sumador {

 public int SumarCifras(int numero) {
	 int suma = 0;
	while(numero>=10) {
		suma = 0;
		suma += numero / 1 % 10; 
		suma += numero / 10 % 10;
		suma += numero / 100 % 10;
		suma += numero / 1000 % 10;
		numero = suma;
	}
	 return suma;
 }

}
