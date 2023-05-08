package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidade.Pessoa;
import repositorio.PessoaRepositorio;




public class ControladorCadastroPessoa implements ActionListener  {
	
	
	JTextField nomeRecebido;
	JTextField CpfRecebido;
	JFrame frameCriandoTelaMenuRecebido;
	JFrame FrameCadastroDePessoaRecebido;
	PessoaRepositorio pessoaRepositorioRecebido;
	
	PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
	
	
	public ControladorCadastroPessoa(JTextField nomeRecebido, JTextField cpfRecebido, JFrame frameCriandoTelaMenu, JFrame FrameCadastroDePessoa,PessoaRepositorio pessoaRepositorio ) {
		
			
		this.nomeRecebido = nomeRecebido;
		this.CpfRecebido = cpfRecebido;
		this.frameCriandoTelaMenuRecebido = frameCriandoTelaMenu;
		this.FrameCadastroDePessoaRecebido = FrameCadastroDePessoa;
		this.pessoaRepositorioRecebido = pessoaRepositorio;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Funcionou o controlador");
		
		
	pessoaRepositorioRecebido.salvar(popularPessoa());
	frameCriandoTelaMenuRecebido.setVisible(true);
	FrameCadastroDePessoaRecebido.setVisible(false);
	}
	
	
	public Pessoa popularPessoa() {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nomeRecebido.getText());
		pessoa.setCpf(CpfRecebido.getText());

		return pessoa;
		
	}
	
	


}
