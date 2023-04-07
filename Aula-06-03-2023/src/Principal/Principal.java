package Principal;

	import Entidade.Televisao;

import javax.swing.JOptionPane;

import Entidade.Celular;
	public class Principal {

	public static void main(String[] args) {
		
		Celular celular = new  Celular();
		Televisao televisao = new Televisao();
		String recebeNomeTemp;
		
		recebeNomeTemp = JOptionPane.showInputDialog("Digite o nome:");
		
		

		JOptionPane.showMessageDialog(null,"O nome recebido foi: " + recebeNomeTemp);
	}

}
