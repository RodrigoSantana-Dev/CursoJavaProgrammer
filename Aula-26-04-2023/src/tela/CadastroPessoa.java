package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCadastroPessoa;
import repositorio.PessoaRepositorio;

public class CadastroPessoa {
	
	
	public void CadastrarPessoa (JFrame frameCriandoTelaMenu, PessoaRepositorio pessoaRepositorio) {
		
		
		
		String Nome = "Digite o Nome: ";
		String Cpf = "Digite o Cpf: ";
		
		
		JFrame FrameCadastroDePessoa = new JFrame();
		FrameCadastroDePessoa.setSize(200,200);
		FrameCadastroDePessoa.setTitle("Tela Cadastro");
		
		
		JPanel PanelCadastroDePessoa = new JPanel();
		
		
		JLabel LabelNome = new JLabel(Nome);
		PanelCadastroDePessoa.add(LabelNome);
		
		JTextField TextNome = new JTextField(10);
		PanelCadastroDePessoa.add(TextNome);
		
		
		JLabel LabelCpf = new JLabel(Cpf);
		PanelCadastroDePessoa.add(LabelCpf);
			
		JTextField TextCpf = new JTextField(10);
		PanelCadastroDePessoa.add(TextCpf);
		
		
		JButton EnviarCadastroDePessoa = new JButton("Enviar");
		PanelCadastroDePessoa.add(EnviarCadastroDePessoa);
		
		ControladorCadastroPessoa controladorCadastroPessoa = new ControladorCadastroPessoa(TextNome,TextCpf,frameCriandoTelaMenu,FrameCadastroDePessoa,pessoaRepositorio );
		EnviarCadastroDePessoa.addActionListener(controladorCadastroPessoa);
		
		FrameCadastroDePessoa.add(PanelCadastroDePessoa);
		FrameCadastroDePessoa.setVisible(true);
		
		
		 
	}
}
