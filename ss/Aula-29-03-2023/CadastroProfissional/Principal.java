import java.util.Scanner;
public class Principal{

      public static void main(String[] args){
	    Scanner entradaDados = new Scanner(System.in);
            Programador programadorNovo = new Programador();
 

            System.out.println("##Digite o nome do programador##");
            programadorNovo.nome = entradaDados.next();

            System.out.println("##Digite o Cpf do programador##");
            programadorNovo.cpf = entradaDados.next();
            
            System.out.println("##Digite a Linguagem de programador##");
            programadorNovo.nomeLinguagem = entradaDados.next();



            System.out.println(programadorNovo.nome);
      	    System.out.println(programadorNovo.cpf);
	    System.out.println("programadorNovo.nomeLinguagem");
      	   

            AdmBanco admBancoNovo = new AdmBanco();
            System.out.println("##Digite o nome do AdmBanco##");
            admBancoNovo.nome = entradaDados.next();

	  
            System.out.println("##Digite o Cpf do AdmBanco##");
            admBancoNovo.cpf = entradaDados.next();
            
            System.out.println("##Digite a TipoDeBancoDeDados##");
           admBancoNovo.TipoDeBancoDeDados = entradaDados.next();


            System.out.println(admBancoNovo.nome);
      	    System.out.println(admBancoNovo.cpf);
	    System.out.println(admBancoNovo.TipoDeBancoDeDados);



       }






















}