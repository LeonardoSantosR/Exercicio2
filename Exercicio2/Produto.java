package Exercicio2;
public class Produto {
	//atributos ou propriedades ou variáveis de instância
	String Nome;
	int Quantidade;
	int validade;

	
	
	// codificação do método construtor
	public Produto(String Nome, int Quantidade, int validade) {
		this.Nome = Nome;
		this.Quantidade = Quantidade;
		this.validade = validade;
	
	}
	
	
	
	// método para retornar os dados do filme
	public String getDados() {
		String aux = "";
		aux = aux + "Nome: " + Nome + "\n";
		aux = aux + "pontuação: " + String.format("%.2f", Quantidade) + "\n";
		aux = aux + "ano: " + String.format("%.2f", validade) + "\n";

		
		return aux;
	}
}