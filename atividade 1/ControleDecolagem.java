
/**
 * Classe de controle 
 * 
 *
 */

package aeroporto;

public class ControleDecolagem {
public static void main(String[] args) {
	
	Fila fila = new Fila();

	Aviao a1 = new Aviao("Boeing 747", "TAM", 1234);
	Aviao a2 = new Aviao("Boeing 777", "Emirates", 1235);
	Aviao a3 = new Aviao("ATR 72-600", "Azul", 1236);
	Aviao a4 = new Aviao("Airbus A321", "TAM", 1237);

	fila.enqueue(a1);
	fila.enqueue(a2);
	fila.enqueue(a3);
	
	
	System.out.println("A fila possui " + fila.tamanhoFila() + " aviões");
	System.out.println(fila.autorizacao());
	
	fila.enqueue(a4);
	System.out.println("\n"+fila.listarAvioesNaFila());
	
	System.out.println(fila.listarInfoPrimeiroAviao());
	
}
}
