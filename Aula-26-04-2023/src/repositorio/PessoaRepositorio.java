package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class PessoaRepositorio  implements PessoaInterface {
	
	
	
		List<Pessoa> listaPessoa = new ArrayList<>();
		
	
	@Override
	public void salvar(Pessoa pessoa) {
	
		listaPessoa.add(pessoa);
		
	}


	@Override
	public List<Pessoa> retonarListaPessoa() {
		// TODO Auto-generated method stub
		return listaPessoa;
	}



	
	
	
	

}
