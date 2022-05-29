package Exercicio2;

import static javax.swing.JOptionPane.*;


import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

//essa classe reune todas as funcionalidades do sistema

	 	public class Util {

	// array para armazenar os objetos Prodtudo
	 		 static Lista<Produto> ProdutosL= new Lista<Produto>();

	// variavel para controlar as posições do array
	private static int posicao = 0;

	// método para gerar e rertonar o menu de opções
	public static String menu() {
		String aux = "Escolha uma opção:\n";
		aux += "1. Registrar Produto\n";
		aux += "2. Pesquisar Produto\n";
		aux += "3. Vender Produto\n";
		aux += "4. Finalizar\n";
		return aux;
	}

	public static void cadastrar() {
			String Nome;
			int Quantidade;
			String validade;
			
			Nome=JOptionPane.showInputDialog("Nome do produto::");
			validade=JOptionPane.showInputDialog("Insira validade nesse modelo (MM/DD/AAAA):");
		    Quantidade=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto:"));
		        if(Quantidade<=0){
		            JOptionPane.showMessageDialog(null, "O Produto precisa de estoque");
		        }else{
		        Produto produto=new Produto(Nome, Quantidade,validade  );
		        if(ProdutosL.pesquisar(produto)!=null){
		            JOptionPane.showMessageDialog(null, "Este produto já está no sistema");
		        } else {
		        	ProdutosL.inserir(produto);
		            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso :)");
		        }
		    }
		    }
	
	public static void Pesquisar() {

        Lista<Produto> copia= new Lista<Produto>();
        No<Produto> aux=ProdutosL.inicio;
        while(aux!=null){
            copia.inserir(aux.dado);
            aux=aux.dir;
        }

        for(int i=0; i<ProdutosL.total;i++){
            aux=copia.inicio; 
            No<Produto> aux2=aux.dir;      
            while(aux2!=null){
                if(aux.dado.getValidade().compareTo(aux.dir.dado.getValidade())>=0){
                    aux=aux2;
                }      
                aux2=aux2.dir;
            }
        
            JOptionPane.showMessageDialog(null, aux.dado.toString());
            copia.remover(aux.dado);
        }

        
    }
	public static void Vender() {
        int valor;
        No<Produto> aux=ProdutosL.inicio;
        String nome;
        boolean achou=false;

        nome=JOptionPane.showInputDialog("Insira o nome do produto");
        while(aux!=null){
        if(aux.dado.getNome().equalsIgnoreCase(nome)){
            Produto produto=aux.dado;
            valor=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade a ser vendida:"));
            produto.Venda(valor);
            if(produto.getQuantidade()==0){
            	ProdutosL.remover(produto);
            }
            achou=true;
            break;
        }
        aux=aux.dir;
    }
        if(achou==false){
            JOptionPane.showMessageDialog(null, "Este produto não foi cadastrado ou esgotou");
        }

        
    }
	 	}