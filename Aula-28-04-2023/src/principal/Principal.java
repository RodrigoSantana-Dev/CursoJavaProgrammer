package principal;

import javax.swing.JOptionPane;
import java.util.Scanner;

import entidade.JogadorDeFutebol;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("inicio de projeto");
		
			
		//¨¨¨¨¨¨¨¨¨¨¨¨¨¨Iniciando uma Lista¨¨¨¨¨¨¨¨¨¨¨¨	
			
			List<JogadorDeFutebol> ListaJogadores = new ArrayList<>();
			String resposta = null;
			
		//¨¨¨¨¨¨¨¨¨¨¨¨¨¨Iniciando uma Entrada de Dados com o Scanner ¨¨¨¨¨¨¨¨¨¨¨¨	

			Scanner entradaDados = new Scanner(System.in);
			boolean resultado = true ;
			
			
		//¨¨¨¨¨¨¨¨¨¨¨¨¨¨Iniciando um Do While¨¨¨¨¨¨¨¨¨¨¨¨	

			
			 do {
				 System.out.println("1 para cadastrar - 2 para sair");
					resposta = entradaDados.nextLine();
					
				 
				 switch (resposta){
				 case"1":
					 
				 	JogadorDeFutebol JogadorRecebido = new JogadorDeFutebol();
				 	
				 		System.out.println("Digite o Nome: ");
				        JogadorRecebido.setNome(entradaDados.nextLine());
				 
				    	System.out.println("Digite o Cpf: ");
				        JogadorRecebido.setCpf(entradaDados.nextLine());
				        
				    	System.out.println("########################################");

				        
				    	ListaJogadores.add(JogadorRecebido);
				    	break;
				    	
				 case"2":
					 resultado = false;
					 break;
					 
				 }
			 } while(resultado);
				 	
			 for (	JogadorDeFutebol JogadorDeFutebol: ListaJogadores ) {
					System.out.println(JogadorDeFutebol.getNome());
					System.out.println(JogadorDeFutebol.getCpf());
					System.out.println("########################################");
					
					
			
			  }
			
			 
			 
	}
}