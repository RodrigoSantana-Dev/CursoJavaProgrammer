package Entidade;

public class Pessoal {
	
	private String nome;
	private String Cpf;
	
	// Get recebe
	
	public String getnome() {
		return this.nome;
	}
	// Set envia
		
	public void setNome(String nomeRecebido) {
		this.nome = nomeRecebido;
	} 
	
	
	// Dados Cpf
	public String getCpf() {
		return this.Cpf;
	}
	public void setCpf(String cpfRecebido) {
		this.Cpf = cpfRecebido;
	}

}