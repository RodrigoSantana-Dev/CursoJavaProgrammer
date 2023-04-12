package telas;

import javax.swing.JOptionPane;
import entidades.Equipamento;
import entidades.Furadeira;
import entidades.Makita;
import servicos.Calculos; 

	
	public class Tela {
		Calculos calc = new Calculos();
		Furadeira furadeira = new Furadeira();
		Makita makita = new Makita();
	 
		public void menu() {
			int opcao; 
			Boolean sair = true;
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Furadeira e 2 para Makita:"));
				 
			     if(opcao == 1) {
				    apresentarFuradeira(cadastroFuradeira());
			     }

		      	if(opcao == 2) {
				   apresentarMakita(cadastroMakita());
			    }
			    if(opcao == 3) {
			       System.exit(0);
			       sair = false;
			    }
		
			}while(sair);
		
		}
		public  Furadeira cadastroFuradeira() {
		
			Furadeira furadeira = new Furadeira();
		
			furadeira.setCodigo(JOptionPane.showInputDialog("Digite o codigo da Furadeira: "));
			furadeira.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
			furadeira.setTipodeBroca(JOptionPane.showInputDialog("Digite o tipo de broca de Furadeira: "));
			furadeira.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de compra de Furadeira: ")));
			furadeira.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de venda de Furadeira: ")));
		
		
			return cadastroFuradeira ();
		}
	
	
			public void apresentarFuradeira(Furadeira furadeiraParametro) {
			JOptionPane.showMessageDialog(null, "O codigo da furadeira é: " + furadeiraParametro.getCodigo());
			JOptionPane.showMessageDialog(null, "A marca da furadeira é: " + furadeiraParametro.getMarca());
			JOptionPane.showMessageDialog(null, "A broca da furadeira é: " + furadeiraParametro.getTipodeBroca());
			JOptionPane.showMessageDialog(null, "O preço de Compra da furadeira é: " + furadeiraParametro.getPrecoDeCompra());
			JOptionPane.showMessageDialog(null, "O preço de Venda da furadeira é: " + furadeiraParametro.getPrecoDeVenda());
			JOptionPane.showMessageDialog(null, "O lucro da furadeira é: " + furadeiraParametro.getLucro());
		}

	
			public Makita cadastroMakita() {

				Makita makita = new Makita();
	    
	    	makita.setCodigo(JOptionPane.showInputDialog("Digite o codigo Makita: "));
	    	makita.setMarca(JOptionPane.showInputDialog("Digite a marca da Makita: "));
	    	makita.setTipoDisco(JOptionPane.showInputDialog("Digite o tipo de Disco Makita: "));
	    	makita.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de compra da Makita: ")));
	    	makita.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de venda da Makita: ")));

		
			return cadastroMakita();
		}
	
	

			public void apresentarMakita(Makita makitaParametro) {
				JOptionPane.showMessageDialog(null, "O codigo da Makita é: " + makitaParametro.getCodigo());
				JOptionPane.showMessageDialog(null, "A marca da Makita é: " + makitaParametro.getMarca());
				JOptionPane.showMessageDialog(null, "A broca da Makita é: " + makitaParametro.getTipoDisco());
				JOptionPane.showMessageDialog(null, "O preço de Compra da Makita é: " + makitaParametro.getPrecoDeCompra());
				JOptionPane.showMessageDialog(null, "O preço de Venda da Makita é: " + makitaParametro.getPrecoDeVenda());
				JOptionPane.showMessageDialog(null, "O lucro da Makita é: " + makitaParametro.getLucro());
			}

	
	
	
  

	
	

	
	
}


