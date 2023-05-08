package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorTelaListaPessoa implements ActionListener {
	
	JFrame frameMenuPrincipalRecebido;
	JFrame frameTelaListaPessoa;


	
	public ControladorTelaListaPessoa(JFrame frameMenuPrincipalRecebido, JFrame frameTelaListaPessoa) {
		super();
		this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
		this.frameTelaListaPessoa = frameTelaListaPessoa;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frameMenuPrincipalRecebido.setVisible(true);
		frameTelaListaPessoa.setVisible(false);
		
		
		
	}
	
	
	
	

}


