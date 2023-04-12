package telas;
import javax.swing.JOptionPane;

import Entidades.Furadeira;
import Entidades.Makita;
import servicos.Calculos;

 public class ResultadoGrafico {
	
	 Calculos calc = new Calculos();
	 
// ############################### Cadastrar equipamento #########################################
	 

	public Furadeira cadastrarFuradeira(Furadeira furadeira) {
		 furadeira.setCodigo(JOptionPane.showInputDialog("Digite o codigo"));
		 furadeira.setMarca("Digite a marca");
		 furadeira.setPrecoDeCompra(300.0);
		 furadeira.setPrecoDeVenda(450.0);
		 furadeira.setLucro(calc.calcularlucro(0, 0));
		 
		return furadeira; 

	}
// ############################### Exibir Resultado #########################################
	public void exibirFuradeira(Furadeira furadeira) { 
		JOptionPane.showMessageDialog(null,furadeira.getCodigo());
	}
	
	
// ############################### Cadastrar equipamento #########################################

	public Makita cadastrarMakita(Makita makita) {
		makita.setCodigo(JOptionPane.showInputDialog("Digite o codigo"));
		 makita.setMarca("Digite a marca");
		 makita.setPrecoDeCompra(300.0);
		 makita.setPrecoDeVenda(450.0);
		 makita.setLucro(Cal.calcularlucro());
		 
		return makita; }
		
// ############################### Exibir Resultado #########################################
	
	public void exibirMakita(Makita makita) {
		JOptionPane.showMessageDialog(null,makita.getCodigo());
		
	}
	

	
	
	
}
