package Exercicio2;
public class Produto {
	//atributos ou propriedades ou vari�veis de inst�ncia
	String Nome;
	int Quantidade;
	int validade;

	
	
	// codifica��o do m�todo construtor
	public Produto(String Nome, int Quantidade, int validade) {
		this.Nome = Nome;
		this.Quantidade = Quantidade;
		this.validade = validade;
	
	}
	
	
	
	// m�todo para retornar os dados do filme
	public String getDados() {
		String aux = "";
		aux = aux + "Nome: " + Nome + "\n";
		aux = aux + "pontua��o: " + String.format("%.2f", Quantidade) + "\n";
		aux = aux + "ano: " + String.format("%.2f", validade) + "\n";

		
		return aux;
	}
}