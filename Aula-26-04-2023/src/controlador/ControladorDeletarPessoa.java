package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorDeletarPessoa implements ActionListener {
	

	JFrame menuPrincipalRecebido;
	JFrame frameDeletarRecebido;
	
	
	
	
	public ControladorDeletarPessoa( JFrame menuPrincipalRecebido, JFrame frameDeletarRecebido) {
	
			this.menuPrincipalRecebido = menuPrincipalRecebido;
			this.frameDeletarRecebido = frameDeletarRecebido;
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Deletar Funcinando ");
		
	}
	
}
