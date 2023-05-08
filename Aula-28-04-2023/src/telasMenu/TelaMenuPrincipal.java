package telasMenu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class TelaMenuPrincipal {
	
	
	public static void MenuPrincipal () { 
		
		String Opcao1 = "Digite 1 Para Cadastrar:";
		String Opcao2 = "Digite 2 Para Cadastrar ";
		
		
		GridLayout grid = new GridLayout (0,1);		
		
		
		JFrame FrameMenuPrincipal = new JFrame ();
		FrameMenuPrincipal.setSize(400, 250);
		FrameMenuPrincipal.setTitle("Menu Principal");
		
		
		JPanel PanelMenuPrincipal = new JPanel ();
		PanelMenuPrincipal.setLayout(grid);
		
		JLabel LabelOpcao1 = new JLabel (Opcao1);
		PanelMenuPrincipal.add(LabelOpcao1);
		
		JLabel LabelOpcao2 = new JLabel (Opcao2);
		PanelMenuPrincipal.add(LabelOpcao2);
		
																																																																																								
		JTextField texteResposta = new JTextField(10);
		PanelMenuPrincipal.add(texteResposta);
		
		JButton botaoEnviar = new JButton("Enviar");
		PanelMenuPrincipal.add(botaoEnviar);
		
		FrameMenuPrincipal.add(PanelMenuPrincipal);
		FrameMenuPrincipal.setVisible(true);
		
		
		System.out.println("tela Menu principal funcionou ");
		
		
		
		
		
		
		
		
		
		
	}
	

}
