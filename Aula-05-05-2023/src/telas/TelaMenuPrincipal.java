package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMenuPrincipal {
	
	public void MenuPrincipal ( ) { 
		
		
		String Opcao1 = "Digite 1  para Cadastrar";
		String Opcao2 = "Digite 2 - para Lista" ;

		
		
		JFrame frameMenuPrincipal = new JFrame ();
		frameMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuPrincipal.setSize(200,200);
		
		JPanel PanelMenuPrincipal = new JPanel();
		
		GridLayout grid = new GridLayout (0,1);		
		frameMenuPrincipal.setLayout(grid);
		
		JLabel LabelOpcao1 = new JLabel (Opcao1);
		PanelMenuPrincipal.add(LabelOpcao1);
		
		JLabel LabelOpcao2 = new JLabel (Opcao2);
		PanelMenuPrincipal.add(LabelOpcao2);
	
		JTextField TextRespostaMenuPrincipal = new JTextField(10);
		PanelMenuPrincipal.add(TextRespostaMenuPrincipal);
		
		JButton butaoEnviarTelaMenuPrincipal = new JButton("Enviar");
		PanelMenuPrincipal.add(butaoEnviarTelaMenuPrincipal);
		
		
		frameMenuPrincipal.add(PanelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		

		
		
		
		
	}

}
