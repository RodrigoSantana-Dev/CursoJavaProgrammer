package tela;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorDeletarPessoa;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import entidade.Pessoa;

public class TelaDeletarPessoa {
	
	
	public void DeletarPessoa (List<Pessoa> ListaPessoa) {
		
		
			
		int quantidadesDelinhas = ListaPessoa.size();
			
		String [][] tabelaString = new String [quantidadesDelinhas][2];
			
		int posicaoColuna = 0;
		int posicaoLinha = 0;
			
			
			for (Pessoa pessoa: ListaPessoa) {
				
				tabelaString[posicaoLinha] [posicaoColuna] = pessoa.getNome();
				
				posicaoColuna++;
				
				tabelaString[posicaoLinha] [posicaoColuna] = pessoa.getCpf();

				posicaoLinha++;
				posicaoColuna = 0;
			}
		
		String nomeColunas[] = {"NOME", "CPF"};
		
	System.out.println("Tela Deleta Funcionou !!!");
		
		JFrame FrameDeletarPessoa = new JFrame();
		FrameDeletarPessoa.setSize(350,350);
		
		JTable tabelaJogador = new JTable (tabelaString, nomeColunas);
		

		tabelaJogador.setBounds(30, 40, 300, 300);
		
	    JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);

		
		
		JPanel penalListaPessoa = new JPanel();
		
		
		 JLabel labelNome = new JLabel("Digite o Nome para deletar:");
		 penalListaPessoa.add(labelNome);
		 
		 JTextField TexteNomeDeletar = new JTextField(10);
		 penalListaPessoa.add(TexteNomeDeletar);
		 
		 JLabel labelCpf = new JLabel("Digite o cpf para deletar:");
		 penalListaPessoa.add(labelCpf);
		 
		 JTextField TexteCpfDeletar = new JTextField(10);
		 penalListaPessoa.add(TexteCpfDeletar);
		 
		
		 penalListaPessoa.add(scrollPaneListarJogador);
		 
		 JButton deletarTelaDeletarJogador = new JButton("Deletar");
		 penalListaPessoa.add(deletarTelaDeletarJogador);
			
		 JButton voltarTelaDeletarJogador = new JButton("Voltar");
		 penalListaPessoa.add(voltarTelaDeletarJogador);
		 
		 
		 
	//	 ControladorDeletarPessoa controladorDeletarPessoa = new ControladorDeletarPessoa
		 
		 FrameDeletarPessoa.add(penalListaPessoa);
		 FrameDeletarPessoa.setVisible(true);
		 


		
	
		
		
		
	}
	
	
}
