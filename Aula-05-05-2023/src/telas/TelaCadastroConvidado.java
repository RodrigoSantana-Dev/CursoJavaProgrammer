package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

 public class TelaCadastroConvidado  {
	 
	 public void CadastroConvidado() {
		 
	
	
	
	String Nome = "Digite o Nome:";
	String Convite = "Digite o Convite:";
	String Endereco = "Digite o Endereco:";
	String Profissao = "Digite o Profissao:";

	
	JFrame frameTelaCadastroConvidado = new JFrame();
	frameTelaCadastroConvidado.setSize(400,400);
	frameTelaCadastroConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameTelaCadastroConvidado.setTitle("Cadastrar Convidado");
	
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨

	GridLayout grid = new GridLayout(0,1);
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨

	 JPanel PanelTelaCadastroConvidado = new JPanel();
	 PanelTelaCadastroConvidado.setLayout(grid);
	 
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	 JLabel LabelNome = new JLabel(Nome);
	 PanelTelaCadastroConvidado.add(LabelNome);	

	 JTextField textNome = new JTextField(10);
	 PanelTelaCadastroConvidado.add(textNome);
		
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	 JLabel LabelConvite = new JLabel(Convite);
	 PanelTelaCadastroConvidado.add(LabelConvite);	
	 
	 JTextField textConvite = new JTextField(10);
	 PanelTelaCadastroConvidado.add(textConvite);
		
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨

	 JLabel LabelEndereco = new JLabel(Endereco);
	 PanelTelaCadastroConvidado.add(LabelEndereco);	
	 
	 JTextField textEndereco = new JTextField(10);
	 PanelTelaCadastroConvidado.add(textEndereco);
	 
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		
	 JLabel LabelProfissao = new JLabel(Profissao);
	 PanelTelaCadastroConvidado.add(LabelProfissao);	
	 
	 JTextField textProfissao = new JTextField(10);
	 PanelTelaCadastroConvidado.add(textProfissao);
	 
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	
	JButton ButtonEnviar = new JButton ("Confirma Cadastro");
	PanelTelaCadastroConvidado.add(ButtonEnviar);
	
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨

	frameTelaCadastroConvidado.add(PanelTelaCadastroConvidado);
	frameTelaCadastroConvidado.setVisible(true);
	
	
	
	
	
	
	 }
	
}