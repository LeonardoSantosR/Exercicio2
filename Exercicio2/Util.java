package Exercicio2;

import static javax.swing.JOptionPane.*;


import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

//essa classe reune todas as funcionalidades do sistema

	 	public class Util {

	// array para armazenar os objetos Atleta
	private static Produto[] Produto = new Produto[5];

	// variavel para controlar as posi��es do array
	private static int posicao = 0;

	// m�todo para gerar e rertonar o menu de op��es
	public static String menu() {
		String aux = "Escolha uma op��o:\n";
		aux += "1. Registrar Produto\n";
		aux += "2. Pesquisar Produto\n";
		aux += "3. Vender Produto\n";
		aux += "4. Finalizar\n";
		return aux;
	}

	public static void cadastrar() {
			String titulo;
			int pontua��o;
			int ano;
			String genero;
		
	
	if(posicao < Produto.length) {
		Produto = showInputDialog("titulo");
		pontua��o = parseInt(showInputDialog("pontua��o"));
		ano = parseInt(showInputDialog("ano"));
		genero = showInputDialog("genero");	
		Produto[posicao] = new Produto(titulo , pontua��o, ano, genero);
		posicao++;
	} else {
		showInternalMessageDialog(null, "Entre em contato com a cl�nica");
	}
		
	}
    
	// m�todo auxiliar para pesquisar um atleta pelo nome
	private static int buscar() {
		int index = -1;
		String titulo = JOptionPane.showInputDialog("titulo");
		for(int i = 0; i < posicao ; i++) {
			if(Produto[i].titulo.equalsIgnoreCase(titulo)) {
				index = 1;
			}
		}
		if(index == -1){
			showMessageDialog(null, titulo + "N�o encontrado(a)");
		}
		return index;
	}

	public static void pesquisar() {
          int index = buscar();
          if (index != -1) {
        	  showMessageDialog(null, Filme[index].getDados());
          }
		
	}

	public static void excluir() {
	     int index = buscar();
		if(index != -1) {
			for(int i = index; i < posicao; i++) {
				Filme[i] = Filme[i + 1];	
			}
			posicao--;	
		}
	}

	


	public static void vender() {
		// TODO Auto-generated method stub
		
	}
	 	}