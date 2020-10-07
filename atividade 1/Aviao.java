/**
 * Classe de definição do Avião 
 * @author Thayane Nunes
 */

package aeroporto;
public class Aviao {

	private String nome;
	private String empresa;
	private int codigoVoo;

	Aviao proximo;

	public Aviao(String nome, String empresa, int codigoVoo) {
		this.nome = nome;
		this.empresa = empresa;
		this.codigoVoo = codigoVoo;
		this.proximo = null;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(int codigoVoo) {
		this.codigoVoo = codigoVoo;
	}

	public void autorizacao(Aviao autorizacao) {
		System.out.println("Favor confirmar a autorização do vôo.");
	}


	@Override
	public String toString() {
		return "Nome = " + nome + ", Empresa = "  + empresa + ", Código do Voo = " + codigoVoo;
	}

}