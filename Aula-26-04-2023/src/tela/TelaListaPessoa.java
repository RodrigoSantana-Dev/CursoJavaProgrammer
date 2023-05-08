package tela;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorTelaListaPessoa;
import entidade.Pessoa;

public class TelaListaPessoa {
	
	public void ListarPessoas(List<Pessoa> ListarPessoa, JFrame frameCriandoTelaMenu) {
		
		int quantidadeDeLinhas = ListarPessoa.size(); 
		
		String[][] tabelaString = new String [quantidadeDeLinhas][2];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for (Pessoa pessoa: ListarPessoa) {
			
			tabelaString[posicaoLinha][posicaoColuna] = pessoa.getNome();
			posicaoColuna ++; 
					
			tabelaString[posicaoLinha][posicaoColuna] = pessoa.getCpf();
			posicaoLinha ++;
			
			 posicaoColuna = 0;
			
		}
		
		/*
		System.out.println("O item da posiçao 0 0 é:" +tabelaString [0][0]);
		System.out.println("O item da posiçao 0 1 é:" +tabelaString [0][1]);
		
		System.out.println("O item da posiçao 1 0 é:" +tabelaString [1][0]);
		System.out.println("O item da posiçao 1 1 é:" +tabelaString [1][1]);
		*/

		String nomesColunas[] = {"Nome","Cpf"};
		
		JFrame frameListaPessoa = new JFrame();			
		frameListaPessoa.setSize(500,550);
		
		JTable tabelaPessoa = new JTable(tabelaString,nomesColunas );
		tabelaPessoa.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarProgramador = new JScrollPane(tabelaPessoa);
		
		JPanel painelListarProgramador = new JPanel();
		painelListarProgramador.add(scrollPaneListarProgramador);
		
		JButton BotaoVoltar = new JButton("Voltar Para o Menu Anterior");
		painelListarProgramador.add(BotaoVoltar);
		
		
		ControladorTelaListaPessoa controladorTelaListaPessoa = new ControladorTelaListaPessoa(frameCriandoTelaMenu,frameListaPessoa);
		BotaoVoltar.addActionListener(controladorTelaListaPessoa);
		
		frameListaPessoa.add(painelListarProgramador);
		frameListaPessoa.setVisible(true);
			
		
		
		

		
	}
}
