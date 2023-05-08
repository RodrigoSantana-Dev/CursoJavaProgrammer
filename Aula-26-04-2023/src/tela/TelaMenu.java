package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import controlador.ControladorMenu;

public class TelaMenu {
	
	
	public void CriandoTelaMenu () {
		
		
		String opcao1 = "Digite 1 para Cadastrar";
		String opcao2 = "Digite 2 para Listar  ";
		String opcao3 = "Digite 3 para Deletar";
		
	    GridLayout grid = new GridLayout (0,1);
	    
	    
	
		
		
		JFrame frameCriandoTelaMenu = new JFrame();
		frameCriandoTelaMenu.setSize(200,200);
		frameCriandoTelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCriandoTelaMenu.setTitle("Menu Principal");
		
		
		JPanel panelCriandoTela = new JPanel();
		panelCriandoTela.setLayout(grid);
		
		
		JLabel labelopcao1 = new JLabel (opcao1);		
		panelCriandoTela.add(labelopcao1 );
		
		JLabel labelopcao2 = new JLabel(opcao2);		
		panelCriandoTela.add(labelopcao2 );
		
		JLabel labelopcao3 = new JLabel(opcao3);		
		panelCriandoTela.add(labelopcao3);
		
		
		
	
		JTextField textResposta = new JTextField(10);
		panelCriandoTela.add(textResposta);
		
		
		
		JButton AcionarBotao = new JButton ("Enviar");
		panelCriandoTela.add(AcionarBotao);

		
		ControladorMenu controladorMenu = new ControladorMenu(textResposta, frameCriandoTelaMenu);
		AcionarBotao.addActionListener(controladorMenu);
		
		
		frameCriandoTelaMenu.add(panelCriandoTela); 
		frameCriandoTelaMenu.setVisible(true);

		
	
		
		
	}

}
