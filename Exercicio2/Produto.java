package Exercicio2;

import javax.swing.JOptionPane;

public class Produto {
	//atributos ou propriedades ou vari�veis de inst�ncia
String Nome, Validade;
int Quantidade;

	
	
	// codifica��o do m�todo construtor
	public Produto(String Nome, int Quantidade, String validade) {
		this.Nome = Nome;
		this.Quantidade = Quantidade;
		this.Validade = Validade;
	
	}
	
	
	
	// m�todo para retornar os dados do filme
	public String getDados() {
		String aux = "";
		aux = aux + "Nome: " + Nome + "\n";
		aux = aux + "Quantidade: " + String.format("%.2f", Quantidade) + "\n";
		aux = aux + "Validade: " + String.format("%.2f", Validade) + "\n";

		
		return aux;
	}
	//M�todo para retorna a Validade do produto
	 public String getValidade() {
	        return Validade;
	    }
	 //M�todo para Retornar Nome do Produto
	 public String getNome() {
	        return Nome;
	    }
	
	   public void Venda(int valor){
	        if(valor>Quantidade){
	            JOptionPane.showMessageDialog(null, "Esse produto n�o possuiu estoque ("+Quantidade+")");
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