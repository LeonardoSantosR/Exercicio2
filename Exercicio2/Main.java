package Exercicio2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;



public class Main {
	public static void main(String[] args) {

    int opcao;
    
    do {
    	opcao = parseInt(showInputDialog(Util.menu()));
    			if (opcao < 1|| opcao >5) {
    				showMessageDialog(null, "Opção inválida");
    			}else {
    				switch(opcao) {
    	
    				case 1:
    					Util.cadastrar();
    					break;
    				case 2:
    					Util.Pesquisar();
    					break;
    				case 3:
    					Util.Vender();
    					break;
    			
    				}
    			}
       }while(opcao != 4);
    
	}

}
