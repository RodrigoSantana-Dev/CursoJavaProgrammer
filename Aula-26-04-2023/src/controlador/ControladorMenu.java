package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Pessoa;
import repositorio.PessoaRepositorio;
import tela.CadastroPessoa;
import tela.TelaListaPessoa;


public class ControladorMenu implements ActionListener{
	
	
	JTextField TexteRespostaRecebida;
	JFrame frameCriandoTelaMenu;
	
	
	

	public ControladorMenu(JTextField texteRespostaRecebida, JFrame frameCriandoTelaMenu) {
		
		this.TexteRespostaRecebida = texteRespostaRecebida;
		this.frameCriandoTelaMenu = frameCriandoTelaMenu;
	}


	CadastroPessoa cadastroPessoal = new CadastroPessoa();	
	
	PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
	
	TelaListaPessoa telaListaPessoa = new TelaListaPessoa();


	@Override
	public void actionPerformed(ActionEvent e) {
		String textResposta = TexteRespostaRecebida.getText();
		
		 if(textResposta.equals("1")||textResposta.equals("2") ) {

				switch (textResposta) {
				
				case "1": 
					cadastroPessoal.CadastrarPessoa(frameCriandoTelaMenu, pessoaRepositorio);
					frameCriandoTelaMenu.setVisible(false);
				
					break;
					
				case "2": 
					telaListaPessoa.ListarPessoas(pessoaRepositorio.retonarListaPessoa(),frameCriandoTelaMenu);
					frameCriandoTelaMenu.setVisible(false);

					break;
		
				}
				
			 }else {
				 JOptionPane.showMessageDialog(null," Opção Invalida !!!");
			
		
		
		
    	}

	}
	
	
		public void imprimirPessoas(List<Pessoa> pessoaLista) {
			
			
			
		}
	
}
