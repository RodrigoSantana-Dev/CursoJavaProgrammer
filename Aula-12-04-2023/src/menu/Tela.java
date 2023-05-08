package menu;
import javax.swing.JOptionPane;

import entidade.ConvidadoVip;
import entidade.CadastroDeConvidado;
import entidade.ConvidadoNormal;


 public class Tela{ // Nome Da Classe que esta sendo usada 
	
	 ConvidadoVip Vip = new  ConvidadoVip (); 
	 ConvidadoNormal Normal = new ConvidadoNormal();
	 CadastroDeConvidado CadConvidado = new CadastroDeConvidado();
	 
	 
	 
	 
	   public void menu() {

	 		int opcao;
	 	

	 		Boolean sair = true;

	 		do {
	 			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao : 1 Para Vip - 2 Para Normal- 3 para sair"));

	 			if(opcao == 1){
	 				
	 				JOptionPane.showInputDialog("Qual é o Tipo do Convidado:  ");		
	 				JOptionPane.showInputDialog("Qual é o nome do convidado:  ");
	 				JOptionPane.showInputDialog("Qual é o Cpf do convidado:  ");
	 			}
	 			if(opcao == 2){
	 				
	 				JOptionPane.showInputDialog("Qual é o Tipo do Convidado:  ");		
	 				JOptionPane.showInputDialog("Qual é o nome do convidado:  ");
	 				JOptionPane.showInputDialog("Qual é o Cpf do convidado:  ");
	 			}
	 			if(opcao == 3){
	 				
	 				sair = false;
	 			}

	 		}while(sair);

	 		System.exit(0);
	     
	     
	     }	 
	   
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨CadastroVip set       ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	 
    
    public ConvidadoVip CadastroVip (){    
    	
    	ConvidadoVip cadastroVip = new ConvidadoVip();
    	
    	cadastroVip.setTipoVip(JOptionPane.showInputDialog("Digite o Nome:  "));
    	cadastroVip.setTipoVip(JOptionPane.showInputDialog("Digite o Cpf:  "));
    	
    	 return cadastroVip;
    }
    
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨CadastroVip get     ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
     public ConvidadoVip exibeVip1 () {
    	
    	ConvidadoVip exibeVip1 = new ConvidadoVip();    	
    	
    	JOptionPane.showInternalMessageDialog(null,"Nome do Vip: " + exibeVip1.getNome());
    	JOptionPane.showInternalMessageDialog(null,"Cpf do Vip: " + exibeVip1.getCpf());

    	return exibeVip1;
    }
    
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨CadastroNormal set       ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
     public ConvidadoNormal CadastroNormal (){    
     	
    	 ConvidadoNormal CadastroNormal = new ConvidadoNormal();
     	
     	CadastroNormal.setNome(JOptionPane.showInputDialog("Digite o Nome:  "));
     	CadastroNormal.setCpf(JOptionPane.showInputDialog("Digite o Cpf:  "));
     	CadastroNormal.setTipoNormal(JOptionPane.showInputDialog("Digite o Tipo : "));

     	 return CadastroNormal;
     }
    
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨CadastroVip get     ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
     public ConvidadoNormal exibeNormal() {
     	
    	 ConvidadoNormal exibeNormal = new ConvidadoNormal();    	
     	
     	JOptionPane.showInternalMessageDialog(null,"Nome do Vip: " + exibeNormal.getNome());
     	JOptionPane.showInternalMessageDialog(null,"Cpf do Vip: " + exibeNormal.getCpf());
		JOptionPane.showMessageDialog(null,"Qual é o Tipo de convite: " + exibeNormal.getTipoNormal());

     	return exibeNormal;
     }
     
     
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ Inicializaçao de opcao de cadastro¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
  
     
}
