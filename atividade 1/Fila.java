/**
 * Classe Fila, onde se encontram os métodos de controle
 */

package aeroporto;

public class Fila {

	Aviao cabeca;
	Aviao cauda;

	private int inseridos;

	public void enqueue(Aviao aviao) {
		if (cabeca == null) {
			cabeca = aviao;
		} else {
			aviao.proximo = cabeca;
			cabeca = aviao;
		}
		inseridos++;
	}

	public int tamanhoFila() {
		return inseridos;
	}

	public Aviao autorizacao() {
		if (this.cabeca == null) {
			return null;
		} else {
			System.out.println("Decolagem autorizada");

			return this.cabeca;
		}
	}
	
	public Aviao listarInfoPrimeiroAviao() {
		if (this.cabeca == null) {
			return null;
		} else {

			return this.cabeca;
		}
	}
	
	public StringBuilder listarAvioesNaFila()
	{
		Aviao aviao = cabeca;
		StringBuilder listarAvioes = new StringBuilder();
		while(aviao!=null)
		{
			listarAvioes.append(aviao.toString()+"\n");
			aviao = aviao.proximo;
		}
		return listarAvioes;
	}
}