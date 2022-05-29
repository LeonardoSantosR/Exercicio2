package Exercicio2;

import javax.swing.JOptionPane;

public class Produto {
	//atributos ou propriedades ou variáveis de instância
String Nome, Validade;
int Quantidade;

	
	
	// codificação do método construtor
	public Produto(String Nome, int Quantidade, String validade) {
		this.Nome = Nome;
		this.Quantidade = Quantidade;
		this.Validade = Validade;
	
	}
	
	
	
	// método para retornar os dados do filme
	public String getDados() {
		String aux = "";
		aux = aux + "Nome: " + Nome + "\n";
		aux = aux + "Quantidade: " + String.format("%.2f", Quantidade) + "\n";
		aux = aux + "Validade: " + String.format("%.2f", Validade) + "\n";

		
		return aux;
	}
	//Método para retorna a Validade do produto
	 public String getValidade() {
	        return Validade;
	    }
	 //Método para Retornar Nome do Produto
	 public String getNome() {
	        return Nome;
	    }
	
	   public void Venda(int valor){
	        if(valor>Quantidade){
	            JOptionPane.showMessageDialog(null, "Esse produto não possuiu estoque ("+Quantidade+")");
	        }else{
	        	Quantidade=Quantidade-valor;
	        }
	        }



	public int getQuantidade() {
		return Quantidade;
	}

    public void setValidade(String Validade) {
        this.Validade = Validade;
    }
    public void setNome(String nome) {
        this.Nome = Nome;
    }
    public void setQuantidade(int qt_estoque) {
        this.Quantidade = Quantidade;
    }
}