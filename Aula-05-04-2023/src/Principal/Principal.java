package Principal;

import java.util.Scanner;
import Entidade.Pessoal;

public class Principal {

	public static void main(String[] args) {
		
		// Variavel
		
		Pessoal pessoaclass = new Pessoal();
		
		// Recebendo Dados
		
		Scanner entradaDados = new Scanner (System.in);
		
		String recebeOnome; 
		String recebeOCpf;
		
	    // Comunicação com o Usuario, Recebendo dados Nome 
		
		System.out.println("Digite o Nome");
		recebeOnome = entradaDados.next();
		
		pessoaclass.setNome(recebeOnome);
		
		System.out.println("O Nome digitado Foi:"+ pessoaclass.getnome());
		
		// Comunicaçao com Usario, Recebendo dados 	Nome 
		
		System.out.println("Digite o Cpf");
		recebeOCpf = entradaDados.next();
		
		pessoaclass.setCpf(recebeOCpf);
		
		
		
		System.out.println("O Nome digitado Foi:"+ pessoaclass.getnome());
		
		
	System.out.println("O Cpf digitado Foi:"+ pessoaclass.getCpf());
		
	}
	

}
